package Question31_40;

//����һ���ַ�����Ҫ��������ַ��������ַ�����������
//ȫ�����㷨https://www.cnblogs.com/zhouthanos/p/3807495.html
public class Main38 {
	
	 public static void main(String[] args){
		 
		String A = "abc";
		char[] arrayA = A.toCharArray();
		recursionArrange(arrayA,0,arrayA.length-1);
		
	 }

	public static void recursionArrange(char[] arrayA,int start,int end){
        if(end <= 1)   
             return;
        if(start == end){
            for(int i = 0;i < arrayA.length;i++)
                System.out.print(arrayA[i]);
            System.out.println();
        }
        else{
            for(int i = start;i <= end;i++){
                swap(arrayA,i,start);	//�͵�һ��Ԫ�ؽ���λ��
                recursionArrange(arrayA,start+1,end);
                swap(arrayA,i,start);	//������ԭ����
            }
        }
        
    }
    //��������mλ�ú�nλ���ϵ�ֵ
    public static void swap(char[] arrayA,int m,int n){
        char temp = arrayA[m];
        arrayA[m] = arrayA[n];
        arrayA[n] = temp;
    }
    
   
	

}
