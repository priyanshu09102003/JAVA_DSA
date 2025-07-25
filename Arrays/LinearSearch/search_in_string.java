public class search_in_string {

    public static void main(String[] args) {
        String name = "Priyanshu";
        char target = 'z';

        System.out.println("The target element exist? " + search(name, target));
        
    }

    static boolean search(String str , char target){
        if (str.length() == 0){
            return false;
        }

        for(int index = 0 ; index<str.length(); index++){
            
            if(target == str.charAt(index)){
                return true;
            }

        }

        return false;
    }
    
}
