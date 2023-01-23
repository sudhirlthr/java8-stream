package java8.streams;

import pojo.State;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MainClass {
    public static void main(String[] args) {
        // state
        List<State> stateList = Builder.getStateList();

        // Print list of states codes
	stateList.stream().forEach(state -> System.out.println(state.getStateCode()));
        // Print list of states codes start with A
	System.out.println("\nState start with \'A\'");
	stateList.stream().filter(s -> s.getStateCode().startsWith("A")).forEach(s -> System.out.println(s.getStateCode()));
	System.out.println("\nModify State with \'UpperCAse\'");
	stateList.stream()
		.filter(s -> s.getStateCode().startsWith("A"))
		.map(s -> s.getStateCode().toUpperCase())
		.forEach(s -> System.out.println(s));

	System.out.println("\nSort all state with stateCode in \'Natural Order\'");
	// stateList.stream().sorted((s1, s2) -> s1.getStateCode().compareTo(s2.getStateCode())).forEach(s -> System.out.println(s.getStateCode()));
	stateList.stream().sorted(Comparator.comparing(State::getStateCode)).forEach(s -> System.out.println(s.getStateCode()));

	System.out.println("\nSort all state with \'Capital name in Natural Order\'");
	stateList.stream().sorted(Comparator.comparing(State::getCapitalName)).forEach(s -> System.out.println(s.getStateCode()+", "+s.getCapitalName()));

	System.out.println("\nPrint state and their capital \'contains a in capital name\'");
	stateList.stream().filter(s -> s.getCapitalName().contains("a")).sorted(Comparator.comparing(State::getCapitalName)).forEach(s -> System.out.println(s.getStateCode()+", "+s.getCapitalName()));

	System.out.println("\nPrint state and their capital \'with Group by\'");
	// stateList.stream().collect(Collectors.groupingBy(State::getCapitalName))
	//	.forEach((s, states) -> {
	//		for (int i = 0; i < states.size(); i++) {
	//			System.out.println(s+", "+states.get(i).getStateCode()+", "+states.get(i).getCapitalName());
	//		}
	//	});
	Map<String, List<State>> collect = stateList.stream().collect(Collectors.groupingBy(State::getCapitalName));
	collect.forEach((s, states) -> {
		for (int i = 0; i < states.size(); i++) {
			System.out.println(s+", "+states.get(i).getStateCode()+", "+states.get(i).getCapitalName());
		}
	});
	}
}
