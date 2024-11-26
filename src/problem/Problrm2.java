package problem;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Problrm2 {
public static void main(String[] args) {
	List<List<String>> skills = Arrays.asList(Arrays.asList("java","spring","spring boot"),
			Arrays.asList("reactjs","angular","javascript"),
			Arrays.asList("mysql","mongodb"));
	List<String> allSkills = skills.stream().flatMap(skillsList -> skillsList.stream()).collect(Collectors.toList());
	System.out.println("allSkills :"+allSkills);
	
	List<String> startWithS = allSkills.stream().filter(skill -> skill.startsWith("s")).collect(Collectors.toList());
	System.out.println("skill start with s :"+startWithS);
 }
}
