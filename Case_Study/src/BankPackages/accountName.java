package BankPackages;

import java.util.ArrayList;

public class accountName {
	
	public ArrayList<String> names;
	
	public accountName() {
		names = new ArrayList<>();
		
		names.add("Renzo");
		names.add("Pamela");
		names.add("Louise");
		names.add("Randy");
		names.add("Jesus");
	}
	
	public String getElement(int index) {
        if (index >= 0 && index < names.size()) {
            return names.get(index);
        } else {
            return null;
        }
    }
	
	public void addNames(String element) {
		names.add(element);
	}
	
	

}
