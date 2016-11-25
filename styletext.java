import java.util.*;
import java.lang.*;
public class styletext //클래스지정 해야함
{
    public static void main (String [] args)
    {
		String fstring="*******임의의 문자열12";
		System.out.println (fstring);
		int check=0;
		int i=0; //check 이후 *가 시작되는 점
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
		//			return 0; //*뒤가 바로 공백일 경우
				}
				check=i;
				break;
			}
		}
		j=string.indexOf('*');
		n=(check-j); //n은 앞 부분 *갯수
		System.out.println(n);//n체크

        System.out.println ("n임");


		   System.out.println (check); //체킹
		i=string.indexOf('*',check); //check 이후에 *를 찾는다

		sub=string.substring(i);
		   System.out.println(i); //체킹 맞
		   System.out.println ("i임");
		if(string.charAt(i-1)==' '){ //뒤에 * 앞에 스페이스가 있을경우
		//	return 0;
		}

		k=sub.length(); //뒤쪽 *부터 총 몇개 있는지

   System.out.println (k);//체킹

		check=0;
		for(j=0; j<k; j++){

			if(sub.charAt(j)!='*'){

				check=j;
				break;
			}
		}
		if(k==j){ //뒤에 *만 있을 경우!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
			check=j;
		}
		   System.out.println (check);
		m=check; //m은 뒷부분 *갯수
   	System.out.println (m);
      	System.out.println ("m임");
  	 	 System.out.println (i);
		sub2=string.substring(0, i+check); //check한 부분까지 다시 잘른다
		System.out.println (sub2);

		k=sub2.length();

		if((n-m)==0){ //앞에 *과 뒤에 *의 갯수가 같을 때
			x=n/2; //몫 ????????????????
			y=n%(2.0); //나머지

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
						System.out.println("여기하고 있음 ");///


			//styletext(chsub) 넘겨야함
  			System.out.println (fin);//전달하는거로 바꿔야함

		}else if((n-m)>0){ //앞에 *이 많을 때
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

			a=string.indexOf('*',i+m);//뒤에 글자만 있을 경우 -1이 출력됨
			k= sub4.length();

			//뒤에가 *만 이루어져있으면 그런 경우는 없음
			//뒤에가 문자만으로 이루어져있으면 그냥 출력 하면 됨
			//뒤에가 문자*문자 뒤섞여 나오는 경우 앞에 n-m개를 더해서 보내야함

			if(k!=0&& a>0){ //뒤에가 문자랑 *로 이루어져있다면
				chsub=string.substring(i+n);
				System.out.println(chsub);
				//styletext(fin,chsub)해야함 fin도 넘겨서 기존 fin 앞에 <strong>이나 <em> 붙여야함
			}

			System.out.println(fin);//값 전달로 바꿔야함


		}else if((n-m)<0){ //뒤에 *이 많을 때
			x=n/2; //몫
			y=n%(2.0); //나머지
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

			a=string.indexOf('*',i+m);//뒤에 글자만 있을 경우 -1이 출력됨


			System.out.println(a);
			System.out.println("a");

			k= sub4.length();
			if(k!=0&& a>0){ //뒤에가 문자랑 *로 이루어져있다면
				chsub=string.substring(i+n);
				System.out.println(chsub);
				//styletext(chsub)해야함
			}
			System.out.println(fin);//결과값 전달로 고쳐야함

		}
/*

		System.out.println(i);

		System.out.println(n);
		chsub=string.substring(i+m);
		k= chsub.length();

			//이거는 n=m 이거나 n<m일때
		for(j=0; j<k; j++){
			if(chsub.charAt(j)=='*'){
				count++;
			}else{
				break;
			}
		}
//nㅇㅣ 더많은 경우에는 count가 나올 수 가없다

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

			//m이 더 클 경우와 같은 경우는  chsub를 파라미터로 넣기만 하면됨
		if(count>0){//뒤에 *가 있는경우
			if(k>count){ //k==count인 경우는 다했음
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

