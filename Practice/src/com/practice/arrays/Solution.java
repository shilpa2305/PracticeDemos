package com.practice.arrays;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

class Result {
	 
    /*
     * Complete the 'dynamicArray' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. 2D_INTEGER_ARRAY queries
     */

    public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
    	List<Integer> result = new ArrayList<>();
		List<List<Integer>> S = new ArrayList<>(n);
		for(int i=1;i<=n;i++){
			S.add(new ArrayList<Integer>());
		}

		//System.out.println(queries.size());
		int lastAnswer = 0;
 	for(List<Integer> list:queries){
 		
 		List<Integer> rowList = list;
 		int x = rowList.get(1);
		int y = rowList.get(2);
		int index = -1;
 		if(rowList.get(0)==1){
 			//System.out.println("First condition---");
 			 index = (x ^ lastAnswer)%2;
 			//System.out.println("Index is"+index);
 			S.get(index).add(y);
  		} 
 		
 	}
 	for(List<Integer> list:queries){
 		
 		List<Integer> rowList = list;
 		int x = rowList.get(1);
		int y = rowList.get(2);
		int index = -1;
		if(rowList.get(0)==2){
		 index = (x ^ lastAnswer)%2;
		 int size = S.get(index).size();
		lastAnswer = S.get(index).get(y%size);
		//System.out.println(lastAnswer);
		result.add(lastAnswer);
		}
 	}
   return result;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
    
        int n = 100;

        int q = 100;

        List<List<Integer>> queries = new ArrayList<>(q);

       
        queries.add(new ArrayList<>(Arrays.asList(1, 345255357, 205970905)));
        queries.add(new ArrayList<>(Arrays.asList(1, 570256166, 75865401)));
        queries.add(new ArrayList<>(Arrays.asList(1, 94777800, 645102173)));
        queries.add(new ArrayList<>(Arrays.asList(1, 227496730, 16649450)));
        queries.add(new ArrayList<>(Arrays.asList(1, 82987157, 486734305)));
        queries.add(new ArrayList<>(Arrays.asList(1, 917920354, 757848208)));
        queries.add(new ArrayList<>(Arrays.asList(1, 61379773, 817694251)));
        queries.add(new ArrayList<>(Arrays.asList(1, 330547128, 112869154)));
        queries.add(new ArrayList<>(Arrays.asList(1, 328743001, 855677723)));
        queries.add(new ArrayList<>(Arrays.asList(1, 407951306, 669798718)));
        queries.add(new ArrayList<>(Arrays.asList(1, 21506172, 676980108)));
        queries.add(new ArrayList<>(Arrays.asList(1, 49911390, 342109400)));
        queries.add(new ArrayList<>(Arrays.asList(1, 980306253, 305632965)));
        queries.add(new ArrayList<>(Arrays.asList(2, 736380701, 402184046)));
        queries.add(new ArrayList<>(Arrays.asList(2, 798108301, 416334323)));
        queries.add(new ArrayList<>(Arrays.asList(1, 254839279, 1370035)));
        queries.add(new ArrayList<>(Arrays.asList(1, 109701362, 2800586)));
        queries.add(new ArrayList<>(Arrays.asList(1, 374257441, 165208824)));
        queries.add(new ArrayList<>(Arrays.asList(1, 624259835, 477431250)));
        queries.add(new ArrayList<>(Arrays.asList(1, 629066664, 454406245)));
        queries.add(new ArrayList<>(Arrays.asList(1, 135821145, 763845832)));
        queries.add(new ArrayList<>(Arrays.asList(1, 480298791, 138234911)));
        queries.add(new ArrayList<>(Arrays.asList(1, 553575409, 835718837)));
        queries.add(new ArrayList<>(Arrays.asList(1, 13022848, 624652920)));
        queries.add(new ArrayList<>(Arrays.asList(1, 974893519, 882630870)));
        queries.add(new ArrayList<>(Arrays.asList(1, 137832930, 216177975)));
        queries.add(new ArrayList<>(Arrays.asList(1, 453349691, 969255659)));
        queries.add(new ArrayList<>(Arrays.asList(1, 138396076, 91038209)));
        queries.add(new ArrayList<>(Arrays.asList(1, 699822497, 941751038)));
        queries.add(new ArrayList<>(Arrays.asList(1, 116800806, 64071662)));
        queries.add(new ArrayList<>(Arrays.asList(1, 815273934, 8835809)));
        queries.add(new ArrayList<>(Arrays.asList(1, 658534867, 657771609)));
        queries.add(new ArrayList<>(Arrays.asList(1, 183760807, 179377441)));
        queries.add(new ArrayList<>(Arrays.asList(1, 93984556, 636425656)));
        queries.add(new ArrayList<>(Arrays.asList(1, 231506463, 836238924)));
        queries.add(new ArrayList<>(Arrays.asList(1, 214074594, 709571211)));
        queries.add(new ArrayList<>(Arrays.asList(1, 649641434, 509698468)));
        queries.add(new ArrayList<>(Arrays.asList(2, 523656673, 709717705)));
        queries.add(new ArrayList<>(Arrays.asList(2, 261443586, 330808140)));
        queries.add(new ArrayList<>(Arrays.asList(1, 75924023, 449768243)));
        queries.add(new ArrayList<>(Arrays.asList(1, 849537714 ,354568873)));
        queries.add(new ArrayList<>(Arrays.asList(2, 641743742, 124196560)));
        queries.add(new ArrayList<>(Arrays.asList(1, 19829224, 995759639)));
        queries.add(new ArrayList<>(Arrays.asList(1, 244389335, 108315212)));
        queries.add(new ArrayList<>(Arrays.asList(1, 877758467, 421383626)));
        queries.add(new ArrayList<>(Arrays.asList(1, 573278148, 474192994)));
        queries.add(new ArrayList<>(Arrays.asList(2, 561031511, 448889978)));
        queries.add(new ArrayList<>(Arrays.asList(1, 773294404, 980994962)));
        queries.add(new ArrayList<>(Arrays.asList(2, 33088709, 716646168)));
        queries.add(new ArrayList<>(Arrays.asList(1, 760927835, 441983538)));
        queries.add(new ArrayList<>(Arrays.asList(1, 273540687, 783321829)));
        queries.add(new ArrayList<>(Arrays.asList(1, 5933845, 384358662)));
        queries.add(new ArrayList<>(Arrays.asList(1, 543628702, 372160176)));
        queries.add(new ArrayList<>(Arrays.asList(2, 136400466, 910559291)));
        queries.add(new ArrayList<>(Arrays.asList(2, 546568738, 393221347)));
        queries.add(new ArrayList<>(Arrays.asList(1, 812227065, 694221123)));
        queries.add(new ArrayList<>(Arrays.asList(1, 311065574, 103905420)));
        queries.add(new ArrayList<>(Arrays.asList(2, 571344361 ,185289590)));
        queries.add(new ArrayList<>(Arrays.asList(1, 99638520 ,173318136)));
        queries.add(new ArrayList<>(Arrays.asList(1, 854060080 ,407068012)));
        queries.add(new ArrayList<>(Arrays.asList(2, 980658213, 778573744)));
        queries.add(new ArrayList<>(Arrays.asList(2, 412539660 ,476853104)));
        queries.add(new ArrayList<>(Arrays.asList(1, 530145366 ,36493537)));
        queries.add(new ArrayList<>(Arrays.asList(1, 604875364, 100141497)));
        queries.add(new ArrayList<>(Arrays.asList(2, 650812104, 64817757)));
        queries.add(new ArrayList<>(Arrays.asList(1, 141060009, 766603553)));
        queries.add(new ArrayList<>(Arrays.asList(1, 598398952, 418245941)));
        queries.add(new ArrayList<>(Arrays.asList(1, 262344011 ,431865586)));
        queries.add(new ArrayList<>(Arrays.asList(2, 56413893 ,546484833)));
        queries.add(new ArrayList<>(Arrays.asList(1, 400736735, 673588153)));
        queries.add(new ArrayList<>(Arrays.asList(1, 642955232, 803851098)));
        queries.add(new ArrayList<>(Arrays.asList(1, 917782037 ,935143105)));
        queries.add(new ArrayList<>(Arrays.asList(1, 658284524, 745224102)));
        queries.add(new ArrayList<>(Arrays.asList(1, 103202288, 501551287)));
        queries.add(new ArrayList<>(Arrays.asList(1, 162144918, 12888783)));
        queries.add(new ArrayList<>(Arrays.asList(1, 16486753, 67467208)));
        queries.add(new ArrayList<>(Arrays.asList(1, 671120703, 941541277)));
        queries.add(new ArrayList<>(Arrays.asList(1, 47399694 ,77707668)));
        queries.add(new ArrayList<>(Arrays.asList(1, 122011395, 946116527)));
        queries.add(new ArrayList<>(Arrays.asList(1, 924363862, 886726236)));
        queries.add(new ArrayList<>(Arrays.asList(2, 657761235, 540240467)));
        queries.add(new ArrayList<>(Arrays.asList(1, 203175991, 279882007)));
        queries.add(new ArrayList<>(Arrays.asList(2, 304620923 ,162838413)));
        queries.add(new ArrayList<>(Arrays.asList(1, 440453449 ,117964712)));
        queries.add(new ArrayList<>(Arrays.asList(2, 941868853 ,887850334)));
        queries.add(new ArrayList<>(Arrays.asList(1, 293198923, 466812643)));
        queries.add(new ArrayList<>(Arrays.asList(1, 461688477, 532794906)));
        queries.add(new ArrayList<>(Arrays.asList(1, 315016797, 733095902)));
        queries.add(new ArrayList<>(Arrays.asList(1, 265008751 ,913972757)));
        queries.add(new ArrayList<>(Arrays.asList(1, 887405255 ,139170948)));
        queries.add(new ArrayList<>(Arrays.asList(2, 754223230, 426836947)));
        queries.add(new ArrayList<>(Arrays.asList(1, 945967814, 852589735)));
        queries.add(new ArrayList<>(Arrays.asList(1, 168866283, 309720694)));
        queries.add(new ArrayList<>(Arrays.asList(1, 373861145 ,94596540)));
        queries.add(new ArrayList<>(Arrays.asList(2, 984122495 ,20702849)));
        queries.add(new ArrayList<>(Arrays.asList(2, 233835636 ,180460242)));
        queries.add(new ArrayList<>(Arrays.asList(1, 172787631, 643823473)));
        queries.add(new ArrayList<>(Arrays.asList(1, 273611372 ,616819555)));
        queries.add(new ArrayList<>(Arrays.asList(1, 196104599 ,690080895)));
        queries.add(new ArrayList<>(Arrays.asList(1, 527554061 ,434103342)));
        /*List<Integer> queriesRowItems0 = new ArrayList<>();
            List<Integer> queriesRowItems1 = new ArrayList<>();
            List<Integer> queriesRowItems2 = new ArrayList<>();
            List<Integer> queriesRowItems3 = new ArrayList<>();
            List<Integer> queriesRowItems4 = new ArrayList<>();
            
            queriesRowItems0.add(1);
            queriesRowItems0.add(0);
            queriesRowItems0.add(5);
            
            queriesRowItems1.add(1);
            queriesRowItems1.add(1);
            queriesRowItems1.add(7);
            
            queriesRowItems2.add(1);
            queriesRowItems2.add(0);
            queriesRowItems2.add(3);
            
            queriesRowItems3.add(2);
            queriesRowItems3.add(1);
            queriesRowItems3.add(0);
            
            queriesRowItems4.add(2);
            queriesRowItems4.add(1);
            queriesRowItems4.add(1);
            
                queries.add(queriesRowItems0);
                queries.add(queriesRowItems1);
                queries.add(queriesRowItems2);
                queries.add(queriesRowItems3);
                queries.add(queriesRowItems4);*/
          

                 

        List<Integer> result = Result.dynamicArray(n, queries);

      for(Integer i:result){
    	  System.out.println(i);
      }
    }
}
