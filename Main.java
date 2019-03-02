package Basic1;

public class Main {
	
	public static void main(String[] args) {
		OurList<String> list=new OurList<>();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		
		System.out.println("added");
		System.out.println("before remoal--> "+list.get(2));
		list.remove(2);
		System.out.println("after remoal--> "+list.get(2));
		System.out.println("size "+list.size());
		System.out.println("List size "+list.listSize());
		System.out.println(list.get(1));
		System.out.println("List size "+list.listSize());
		
	}

}
