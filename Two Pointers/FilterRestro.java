import java.util.*;

public class FilterRestro {

    public List<Integer> filterRestaurants(int[][] restaurants,
                                           int veganFriendly,
                                           int maxPrice,
                                           int maxDistance) {

        Arrays.sort(restaurants, (a, b) -> {

            if (a[1] == b[1]) {
                return b[0] - a[0];
            }

            return b[1] - a[1];
        });

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < restaurants.length; i++) {

            if (restaurants[i][2] >= veganFriendly &&
                restaurants[i][3] <= maxPrice &&
                restaurants[i][4] <= maxDistance) {

                result.add(restaurants[i][0]);
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int[][] restaurants = {
                {1,4,1,40,10},
                {2,8,0,50,5},
                {3,8,1,30,4},
                {4,10,0,10,3},
                {5,1,1,15,1}
        };

        int veganFriendly = 1;
        int maxPrice = 50;
        int maxDistance = 10;

        FilterRestro obj = new FilterRestro();

        List<Integer> result =
                obj.filterRestaurants(restaurants,
                                      veganFriendly,
                                      maxPrice,
                                      maxDistance);

        System.out.println(result);
    }
}
