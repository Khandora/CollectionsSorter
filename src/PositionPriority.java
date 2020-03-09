import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class PositionPriority implements Comparator<OrganizationStructure> {
    public static final String SECONDARY_ROLE = "Secondary role";
    public static final String MAIN_ROLE = "Main role";
    public static final String SECONDARY_PROD = "Secondary producer";
    public static final String MAIN_PROD = "Main producer";
    public static final String JUNIOR_STUNT = "Junior stunt";
    public static final String SENIOR_STUNT = "Senior stunt";
    public static Map<String , Integer> positionPriority = new HashMap<>();
    static {
        positionPriority.put(JUNIOR_STUNT,6);
        positionPriority.put(SENIOR_STUNT,5);
        positionPriority.put(SECONDARY_PROD,4);
        positionPriority.put(MAIN_PROD,3);
        positionPriority.put(SECONDARY_ROLE,2);
        positionPriority.put(MAIN_ROLE,1);
    }

    @Override
    public int compare(OrganizationStructure o1, OrganizationStructure o2) {
        return positionPriority.get(o1.getPosition()) - positionPriority.get(o2.getPosition());
    }
}