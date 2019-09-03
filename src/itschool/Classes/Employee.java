package itschool.Classes;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class Employee extends Person
{
    @Setter @Getter
    int salary;

}
