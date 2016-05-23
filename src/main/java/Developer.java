import java.math.BigDecimal;

/**
 * Created by phujcn on 16/05/2016.
 */

public class Developer {
    public String name = "";
    public BigDecimal salary = null;
    public int age = 0;
    public Developer (String nameString, BigDecimal salaryBigDecimal, int ageInt){
        name= nameString;
        salary = salaryBigDecimal;
        age = ageInt;
    }
}
