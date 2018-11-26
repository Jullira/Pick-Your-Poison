package project.service;

import project.persistence.entities.Location;
import project.persistence.entities.Whiskey;

import java.util.List;

public interface SearchService {

        /**
         * Searches for Whiskey matching the properties of the given Whiskey
         * @param whiskey that contains the search properties
         * @return a list of Whiskey object that match the search criteria
         */
         List<Whiskey> search(Whiskey whiskey);

        /**
         * Searches for Whiskey by name
         * @param whiskey to search for
         * @return a list of Whiskey objects that have a name that match the name param
         */
         List<Whiskey> searchWhiskeyByName(Whiskey whiskey);

        /**
         * Searches for Whiskey by name
         * @param location to search for
         * @return a list of Whiskey objects that have a name that match the name param
         */
        List<Location> searchLocationByName(Location location);

    }


