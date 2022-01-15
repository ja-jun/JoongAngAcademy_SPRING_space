package polymorhism;

import java.util.HashMap;

public class TvContainer {
	
	private HashMap<String, TV> map = new HashMap<String, TV>();
	
	public TvContainer() {
		map.put("samsung", new SamsungTv());
		map.put("lg", new LgTv());
	}

	public TV getTv(String name) {
		return map.get(name);
	}
	
}
