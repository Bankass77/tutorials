package zoo.tours.reservations;

import java.util.ArrayList;
import java.util.List;
import java.util.ServiceLoader;

import zoo.tours.api.Tour;

public class TourFinder {
	public static Tour findSingleTour() {
		ServiceLoader<Tour> loader = ServiceLoader.load(Tour.class);

		for (Tour tour : loader) {

			return tour;

		}
		return null;
	}

	public static List<Tour> findAllTours() {

		List<Tour> tours = new ArrayList<>();

		ServiceLoader<Tour> loader = ServiceLoader.load(Tour.class);

		for (Tour tour : loader) {

			tours.add(tour);
			return tours;
		}

		return null;
	}
}
