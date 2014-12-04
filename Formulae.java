package mts;
import java.util.HashMap;
public class Formulae {
	public HashMap<String,String> formula_lhs=new HashMap<String,String>();
	public  HashMap<String,String> formula_rhs=new HashMap<String,String>();
	public HashMap<String,Integer> formula_length_of_rhs=new HashMap<String,Integer>();
public Formulae()
{
	//r1
	formula_lhs.put("R1", "E");
	formula_rhs.put("R1", "E+T");
	formula_length_of_rhs.put("R1", 3);
	//r2
	formula_lhs.put("R2", "E");
	formula_rhs.put("R2", "T");
	formula_length_of_rhs.put("R2", 1);
	//r3
	formula_lhs.put("R3", "T");
	formula_rhs.put("R3", "T*F");
	formula_length_of_rhs.put("R3", 3);
	//r4
	formula_lhs.put("R4", "T");
	formula_rhs.put("R4", "F");
	formula_length_of_rhs.put("R4", 1);
	//r5
	formula_lhs.put("R5", "F");
	formula_rhs.put("R5", "(E)");
	formula_length_of_rhs.put("R5", 3);
	//r6
	formula_lhs.put("R6", "F");
	formula_rhs.put("R6", "id");
	formula_length_of_rhs.put("R6", 1);
}
}
