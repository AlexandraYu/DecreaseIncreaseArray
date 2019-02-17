public class DecreaseIncrease{

    public static int[] diStringMatch(String s) {
        int n = s.length(); 
        int[] myArray = new int[n+1]; //the number array always has 1 more element than given string s 
        for (int count=0; count<=n; count++) {
            myArray[count]=count; 
        }
        int[] solution = new int[n+1]; 
        //intuitively, if first element in s is 'I', then 0 can definitely be the first element for the answer, if it's 'D', then n candefinitely be the first elemtn
        //the idea is, whenever the letter is 'D', you get the biggest number in the array that's not yet used, and if it's 'I', you use the smallest number in the array that's not yet used.
        int i=0, j=n, p=0; 
        for (p=0; p<n; p++) {
            if(s.charAt(p) == 'I') {
                solution[p] = myArray[i]; 
                i++;
            }
            else {//s.charAt(p) == 'D'
                solution[p] = myArray[j]; 
                j--; 
            }
        }
        solution[p] = myArray[i]; //after done with going through each character in string s, there's one last empty space in solution to be filled in with the last elemnt
        return solution; 
    }
     public static void main(String []args){
        String myString="DII"; 
        int [] answer = diStringMatch(myString);
        for (int i=0; i<answer.length; i++) {
            System.out.println(answer[i]+" ");
        }
     }
}
