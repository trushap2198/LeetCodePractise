

class DeleteUnsortedCols {
    public int minDeletionSize(String[] strs) {
        int delete = 0;
        for(int j =0;j<strs[0].length();j++){
            for(int i =0 ;i<strs.length-1;i++){
                if(strs[i].charAt(j)>strs[i+1].charAt(j))
                {
                    //System.out.println(chrs[i][j]+":"+chrs[i+1][j]);
                    delete++;
                    break;
                }
            }
        }
        return delete;

    }
}
