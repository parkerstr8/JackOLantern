public class JackOLantern
{
    private String[][] faceFeatures;
    public JackOLantern(String[][] faceFeatures)
    {
        this.faceFeatures=faceFeatures;
    }
    public void edit(String replace, int row, int column) {
        faceFeatures[row][column] = replace;

    }

    public void fill(String str)
    {
        for(int x=0; x<faceFeatures.length; x++)
        {
            for(int y=0; y<faceFeatures[x].length; y++)
            {
                this.faceFeatures[x][y]=str;
            }
        }
    }
    public String toString()
    {
        String str1="";
        for(int i=0; i<faceFeatures.length; i++)
        {
            for(int z=0; z<faceFeatures[i].length;z++)
            {
                str1=str1 + faceFeatures[i][z];
            }
            str1=str1+"\n";
        }
        return str1;
    }


}
