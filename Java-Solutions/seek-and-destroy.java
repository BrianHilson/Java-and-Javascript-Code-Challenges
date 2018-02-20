/* From FreeCodeCamp: https://www.freecodecamp.org/challenges/seek-and-destroy 

"You will be provided with an initial array
(the first argument in the destroyer function), 
followed by one or more arguments. Remove all 
elements from the initial array that are of 
the same value as these arguments."

For Java I've modified the requirements. The method will take two paramenters:
the first is the array to be modified by removing elements, the second is the 
elements to remove.

*/
package seekanddestroy;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class SeekAndDestroy {

    public static void main(String[] args) {
        
        Object[] target = {1, 2, 3, 1, 2, 3, 4, 5, 6, 6, "dfkjdf", "k"};
        Object[] remove = {2, 3, "k", 6};
        
        System.out.println(Arrays.toString(destroyer(target, remove)));

    }

    public static Object[] destroyer(Object[] target, Object[] remove) {
        List<Object> cleaned = new ArrayList<>();
        for (Object thing : target) {
            Boolean destroy = false;
            for (Object toRemove : remove) {
                if (thing.equals(toRemove)) {
                    destroy = true;
                }
            }
            if (destroy == true) {
            } else {
                cleaned.add(thing);
            }
        }
        Object[] returnCleaned = arrayListToArray(cleaned);
        return returnCleaned;
    }
    
    public static Object[] arrayListToArray(List<Object> things) {
        Object[] objectArray = new Object[things.size()];
        for (int i = 0; i < things.size(); i++) {
            objectArray[i] = things.get(i);
        }
        
        return objectArray;
    }
}
