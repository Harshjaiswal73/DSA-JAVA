// find npr 
package Functions;

import java.util.Scanner;

public class Main {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int r = sc.nextInt();

    int nfact = 1;
    for(int i=1;i<=n;i++){
        nfact*=i;
    }

    int nmrfact = 1;
    for(int i=1;i<=n-r;i++){
        nmrfact *=i;
    }

    int npr = nfact / nmrfact;
    System.out.println(n + "p" + r + " = " + npr);

    
}