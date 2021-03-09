package programmers;

public class skillTree {
    public static int solution(String skill, String[] skill_trees) {
        int answer = 0;
        for(int i=0; i<skill_trees.length; i++){
            String s = "";
            String[] str = skill_trees[i].split("");
            for(int j=0; j<str.length; j++){
                if(skill.contains(str[j])){
                    s += str[j];
                }
            }
            boolean flag = true;
            for(int k=0; k<s.length();k++){
                if(s.charAt(k)!=skill.charAt(k)){
                    flag = false;
                }
            }
            if(flag){
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args){
        String a = "CBD";
        String[] b = {"BACDE", "CBADF", "AECB", "BDA"};
        int answer = solution(a, b);

        System.out.print(answer);
    }
}
