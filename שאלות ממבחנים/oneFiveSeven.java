


/*
 * 
 * כל מספר חיובי שלם ניתן לכתיבה ב- 1 ת 5ת 7
 *n עליכם לכתוב שיטה רקרוסיבית המקבלת כפרמטר מספר שלם 
 ומחזירה את מספר המחברים המינמלי
 
 10= 7+1+1+1 = 5+5 = 5+1+1+1+1+1 = 1+1+1+1+1+1+1+1+1+1+
 */

public class oneFiveSeven {

    public static int oneFiveSeven(int n) {
        if(n < 0)
            return Integer.MAX_VALUE;
        if(n==0)
          return 0;
        int one = 1+ oneFiveSeven(n-1);
        int five = 5+ oneFiveSeven(n-5);
        int seven = 7+ oneFiveSeven(n-7);

        return  Math.min(one, Math.min(five, seven));
    }  


    
}

/**
 * 
 * שולחים 1 5 7
 * וכל פעם  קוראים עוד הפעם +1
 * עד שזה שווה ל-0
 * ואז בודקים מה המינמלי
 */

 /*
  * count עם משתנה
  */


 public static int oneFiveSeven(int n) {
    return oneFiveSeven(n, 0, Integer.MAX_VALUE)
 }

 public static int oneFiveSeven(int n, int sum) {
    if(n==0 && )
      
    return sum;
    
    if(n <0){
      return Integer.MAX_VALUE;

      int one = 1+ oneFiveSeven(n-1, sum +1);
      int five = 5+ oneFiveSeven(n-5,  sum +1)
      int seven = 7+ oneFiveSeven(n-7,  sum +1)

      return  Math.min(one, Math.min(five, seven));
    }
 }
