import java.util.*;
import java.lang.*;
public class styletext //Ŭ�������� �ؾ���
{
    public static void main (String [] args)
    {
		String fstring="*******������ ���ڿ�12";
		System.out.println (fstring);
		int check=0;
		int i=0; //check ���� *�� ���۵Ǵ� ��
		String string=fstring;
		int k=0;
		int n=0;
		int m=0;
		int j=0;
		int count=0;
		int l=0;
		int x=0;
		int a=0;
		double y=0.0;

		String fin="";
		String sub="";
		String sub2="";
		String sub3="";
		String sub4="";
		String chsub="";


		k= string.length();

		for(i= string.indexOf('*'); i<k; i++){

			if(string.charAt(i)!='*'){
				if(string.charAt(i)==' '){
		//			return 0; //*�ڰ� �ٷ� ������ ���
				}
				check=i;
				break;
			}
		}
		j=string.indexOf('*');
		n=(check-j); //n�� �� �κ� *����
		System.out.println(n);//nüũ

        System.out.println ("n��");


		   System.out.println (check); //üŷ
		i=string.indexOf('*',check); //check ���Ŀ� *�� ã�´�

		sub=string.substring(i);
		   System.out.println(i); //üŷ ��
		   System.out.println ("i��");
		if(string.charAt(i-1)==' '){ //�ڿ� * �տ� �����̽��� �������
		//	return 0;
		}

		k=sub.length(); //���� *���� �� � �ִ���

   System.out.println (k);//üŷ

		check=0;
		for(j=0; j<k; j++){

			if(sub.charAt(j)!='*'){

				check=j;
				break;
			}
		}
		if(k==j){ //�ڿ� *�� ���� ���!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
			check=j;
		}
		   System.out.println (check);
		m=check; //m�� �޺κ� *����
   	System.out.println (m);
      	System.out.println ("m��");
  	 	 System.out.println (i);
		sub2=string.substring(0, i+check); //check�� �κб��� �ٽ� �߸���
		System.out.println (sub2);

		k=sub2.length();

		if((n-m)==0){ //�տ� *�� �ڿ� *�� ������ ���� ��
			x=n/2; //�� ????????????????
			y=n%(2.0); //������

			System.out.println(x);
			fin=sub2.replace("*", "");
			if(y==1.0){
						fin="<em>"+fin+"</em>";
			}
			for(j=0; j<x; j++){
							fin="<strong>"+fin+"</strong>";
			}


			sub4=string.substring(i+m);
			k= sub4.length();
			System.out.println(sub4);

			for(j=0; j<k; j++){
				if(sub4.charAt(j)=='*'){
					count++;
				}
			}
			System.out.println(count);
						System.out.println("�����ϰ� ���� ");///


			//styletext(chsub) �Ѱܾ���
  			System.out.println (fin);//�����ϴ°ŷ� �ٲ����

		}else if((n-m)>0){ //�տ� *�� ���� ��
			x=m/2;
			y=m%(2.0);
			l=string.indexOf('*');
			sub3=sub2.substring((n-m-1)+l);


			fin=sub3.replace("*", "");

			if(y==1.0){
				fin="<em>"+fin+"</em>";
			}

			for(j=0; j<x; j++){
				fin="<strong>"+fin+"</strong>";
			}

			fin=string.substring(0,(n-m))+fin+string.substring(i+m);


			sub4=string.substring(i+m);
			System.out.println(sub4);

			a=string.indexOf('*',i+m);//�ڿ� ���ڸ� ���� ��� -1�� ��µ�
			k= sub4.length();

			//�ڿ��� *�� �̷���������� �׷� ���� ����
			//�ڿ��� ���ڸ����� �̷���������� �׳� ��� �ϸ� ��
			//�ڿ��� ����*���� �ڼ��� ������ ��� �տ� n-m���� ���ؼ� ��������

			if(k!=0&& a>0){ //�ڿ��� ���ڶ� *�� �̷�����ִٸ�
				chsub=string.substring(i+n);
				System.out.println(chsub);
				//styletext(fin,chsub)�ؾ��� fin�� �Ѱܼ� ���� fin �տ� <strong>�̳� <em> �ٿ�����
			}

			System.out.println(fin);//�� ���޷� �ٲ����


		}else if((n-m)<0){ //�ڿ� *�� ���� ��
			x=n/2; //��
			y=n%(2.0); //������
			l=string.indexOf('*');
			sub3=sub2.substring(l, i+n);


			fin=sub3.replace("*", "");

			if(y==1.0){
				fin="<em>"+fin+"</em>";
			}

			for(j=0; j<x; j++){
				fin="<strong>"+fin+"</strong>";
			}
			fin= string.substring(0, l)+fin+string.substring(i+n);


			sub4=string.substring(i+m);
			System.out.println(sub4);

			a=string.indexOf('*',i+m);//�ڿ� ���ڸ� ���� ��� -1�� ��µ�


			System.out.println(a);
			System.out.println("a");

			k= sub4.length();
			if(k!=0&& a>0){ //�ڿ��� ���ڶ� *�� �̷�����ִٸ�
				chsub=string.substring(i+n);
				System.out.println(chsub);
				//styletext(chsub)�ؾ���
			}
			System.out.println(fin);//����� ���޷� ���ľ���

		}
/*

		System.out.println(i);

		System.out.println(n);
		chsub=string.substring(i+m);
		k= chsub.length();

			//�̰Ŵ� n=m �̰ų� n<m�϶�
		for(j=0; j<k; j++){
			if(chsub.charAt(j)=='*'){
				count++;
			}else{
				break;
			}
		}
//n���� ������ ��쿡�� count�� ���� �� ������

		a=chsub.indexOf('*');
		for(j=a; j<k; j++){
					if(chsub.charAt(j)=='*'){
						count++;
					}else{
						break;
					}
		}


		System.out.println(count);
		System.out.println(k);

			//m�� �� Ŭ ���� ���� ����  chsub�� �Ķ���ͷ� �ֱ⸸ �ϸ��
		if(count>0){//�ڿ� *�� �ִ°��
			if(k>count){ //k==count�� ���� ������
				if((n-m)>count){

					x=count/2;
					y=count/2.0;

				if(y==1.0){
					fin="<em>"+fin+"</em>";
				}

				for(j=0; j<x; j++){
					fin="<strong>"+fin+"</strong>";
				}

					fin=string.substring(0,n-m-count-1)+fin;
					System.out.println(fin);
		}
*/
}
}

