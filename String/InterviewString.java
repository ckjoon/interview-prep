public class InterviewString{
	public static void main(String[] args){
		if(isAnagram("abc","bca")){
			System.out.println("Anagram checker works");
		}
		System.out.println(reverse("ABC"));
		if(isPalindrome("ABA")){
			System.out.println("isPalindrome works");
		}
			
	}
	
	public static boolean isAnagram(String a, String b){
		int[] count = new int[256];
		for(int i=0; i < a.length();i++){
			count[(int)a.charAt(i)]++;
		}
		for(int i=0; i < b.length();i++){
			count[(int)b.charAt(i)]--;
			if(count[(int)b.charAt(i)]<0){
				return false;
			}
		}
		for(int i=0;i<count.length;i++){
			if(count[i]!=0){
				return false;
			}
		}
		return true;
	}
	
	public static String reverse(String s){
		String buf = "";
		for(int i=s.length()-1;i>=0;i--){
			buf+=s.charAt(i);
		}
		return buf;
	}
	
	public static boolean isPalindrome(String s){
		int end = s.length()-1;
		int mid = end/2;
		for(int i = 0; i < mid;i++){
			if(s.charAt(i)!=s.charAt(end-i)){
				return false;
			}
		}
		return true;
	}
	
	
}
