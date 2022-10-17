import java.util.Arrays;

public class Main {

    static boolean isFind(int[] arr,int a){
        for(int i:arr){
            if(a==i){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
	int[] dizi = {20,30,40,10,10,10,10,10,50,60,60,50,10,30,40,10,80};
	int[] dizi2 = new int[dizi.length];
	int index=0;
	int t=0;
	int[] frekans = new int[dizi.length];
    System.out.println("Tekrar Sayıları");
	for(int i=0;i<dizi.length;i++){
        frekans[i]=1;
        if(isFind(dizi2,dizi[i])){
            dizi2[index++] = dizi[i];
        }
	    for(int j=0;j<dizi.length;j++){
	        if(i!=j&&dizi[i]==dizi[j]){
	        frekans[i]++;
            }
        }
        if(dizi2[t]!=0){
            System.out.println(dizi2[t]+" sayısı "+frekans[i]+" kere tekrar edildi.");
        t++;}
    }



    }
}
