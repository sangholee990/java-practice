package train06;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

public class train06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Location[] location = new Location[4];
		HashMap<String, Location> manage = new HashMap<String, Location>();
		System.out.println("도시, 경도, 위도를 입력하세요.");
		for(int i=0; i<location.length; i++) {
			System.out.print(">> ");
			String text = sc.nextLine();
			StringTokenizer st = new StringTokenizer(text, ",");
			String city = st.nextToken().trim();
			int longitude = Integer.parseInt(st.nextToken().trim());
			int latitude = Integer.parseInt(st.nextToken().trim());
			location[i] = new Location(city, longitude, latitude);
			manage.put(city, location[i]); // ArrayList에 저장
		}
		Set<String> key = manage.keySet();
		Iterator<String> it = key.iterator();
		System.out.println("----------------------------------");
		while(it.hasNext()) {
			String city = it.next();
			Location s = manage.get(city);
			System.out.println(s.get_city() +" "+s.get_longitude()+" "+s.get_latitude());
		}
		System.out.println("----------------------------------");
		while(true) {
			System.out.print("도시 이름 >> ");
			String city = sc.next();
			if(city.equals("그만"))
				break;
			Location s = manage.get(city);
			if( s == null)
				System.out.println(city+"는 없습니다.");
			else
				s.find_location(city);
		}
		sc.close();
	}
}

