class 1598_CrawlerLogFolder 
{
    public static int minOperations(String[] logs) 
    {
        Stack<String> op = new Stack<>();
        
        for(String log : logs)
        {
            if(!log.equals("./"))
            { 
                if(!log.equals("../"))
                {
                    op.push(log); 
                }
                else
                {
                   if(!op.empty())
                   {
                       op.pop();
                   }
                }
            }
        }
        return op.size();
    }
}