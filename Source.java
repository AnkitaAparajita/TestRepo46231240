package doselect.prob1;

class Source {
	public static int distance(String word1, String word2){
		int[][] distance=new int[word1.length()+1][word2.length()+1];
		distance[0][0]=0;
        for(int i=1;i<=word1.length();i++) distance[i][0]=i;
        for(int j=1;j<=word2.length();j++) distance[0][j]=j;
        for(int i=1;i<=word1.length();i++){
            for(int j=1;j<=word2.length();j++){
                if(word1.charAt(i-1)==word2.charAt(j-1)) 
                	distance[i][j]=distance[i-1][j-1];
                else 
                	distance[i][j]=Math.min(Math.min(distance[i-1][j],distance[i][j-1]),distance[i-1][j-1])+1;
            }
        }
        return distance[word1.length()][word2.length()];
	}
	public static void main(String[] args) {
		System.out.println(distance("horse","ros"));
	}
}