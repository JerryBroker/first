public class FindZhiShu {


	public static void main(String[] args) {
		   /*
		     打印输出质数的时候务必按照如下格式：System.out.print(质数+" ")；
		     使用print进行打印同时被打印输出的质数后加上一个空格，
		     以便于与平台提供的结果格式保持一致！
            */

		   /**********begin**********/
		   int flag = 0;
		   for(int i = 1;i<1000;i++){
			   if(i == 2 || i==3)
			   {
				   System.out.print(i +" ");
				   continue;
			   }
			   if(i == 1){
				   continue;
				
			   }
			   for(int j = 2;j<=i/2;j++){
				
        if(i%j == 0){
          flag = 0;
          continue;
        }


        }
        if(flag == 1)
        {
          System.out.print(i+ " ");
        }
        flag = 1;

		
			   
		   }


           /**********end**********/	
	}
}
