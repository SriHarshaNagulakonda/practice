class upper {
	public static void main(String args[])
	{
		String a="LokesKumarKolluri";
		int i;
		int count = 0;
		for(i=0;i<a.length();i++)
		{
			if(Character.isUpperCase(a.charAt(i)))
			{
				count++;
			}
		}
		System.out.println(count);
	}
}