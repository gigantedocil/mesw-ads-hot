/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hot.domain.entities.room.repositories;

import hot.domain.entities.room.Room;
import hot.repository.AbstractBaseRepository;

/**
 *
 * @author Me
 */
public class RoomRepository extends AbstractBaseRepository<Room> {

    @Override
    public Room find(String objectName) {
        return super
                .retrieveAll()
                .stream()
                .filter(r -> r.getName().equals(objectName))
                .findFirst()
                .get();
    }
}
