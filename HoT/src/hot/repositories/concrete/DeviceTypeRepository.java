/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hot.repositories.concrete;

import hot.domain.entities.device.Device;
import hot.factories.DeviceFactory;
import hot.repositories.IRepository;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Me
 */
public class DeviceTypeRepository implements IRepository<String> {

    @Override
    public boolean add(String object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean remove(String object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean exists(String object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<String> retrieveAll() {
        return new ArrayList<>(Arrays.asList(getAvailableDeviceTypes()));
    }

    private String[] getAvailableDeviceTypes() {

        List<String> availableDeviceTypesNames = new ArrayList<>();

        try {
            String packageName = Device.class.getPackage().getName() + DeviceFactory.DEVICES_PACKAGE_NAME;

            Class[] availableDeviceTypes = getClasses(packageName);

            for (Class availableDeviceType : availableDeviceTypes) {
                availableDeviceTypesNames.add(availableDeviceType.getName());
            }

            return availableDeviceTypesNames
                    .stream()
                    .map(d -> {
                        String[] aux = d.split("\\.");
                        return aux[aux.length - 1];
                    }).toArray(String[]::new);
        } catch (ClassNotFoundException | IOException ex) {
            // TODO: Add logger
        }

        return null;
    }

    private Class[] getClasses(String packageName) throws ClassNotFoundException, IOException {

        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();

        assert classLoader != null;

        String path = packageName.replace('.', '/');

        Enumeration resources = classLoader.getResources(path);

        List dirs = new ArrayList();

        while (resources.hasMoreElements()) {

            URL resource = (URL) resources.nextElement();

            dirs.add(new File(resource.getFile()));
        }

        ArrayList classes = new ArrayList();

        for (Object directory : dirs) {
            classes.addAll(findClasses((File) directory, packageName));
        }

        return (Class[]) classes.toArray(new Class[classes.size()]);
    }

    private List findClasses(File directory, String packageName) throws ClassNotFoundException {

        List classes = new ArrayList();

        if (!directory.exists()) {
            return classes;
        }

        File[] files = directory.listFiles();

        for (File file : files) {
            if (file.isDirectory()) {

                assert !file.getName().contains(".");

                classes.addAll(findClasses(file, packageName + "." + file.getName()));

            } else if (file.getName().endsWith(".class")) {
                classes.add(Class.forName(packageName + '.' + file.getName().substring(0, file.getName().length() - 6)));
            }
        }
        return classes;
    }
}
