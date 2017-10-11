@Controller
public class test{
  SqlSession sqlSession= 
  Map map = sqlSession.selectOne("selectById");
  Clob clobRef = (Clob)map.get("BIGSTRING");
  Reader reader = clobRef.getCharacterStream();
  BufferedReader brRef = new BufferedReader(reafer);
  char[] charArray = new char[2048];
  int readLength = brRef.read(charArray);
  while(readeLength != -1)
  {
    String bigString = new String(charArray,0,readeLength);
    System.out.println(bigString);
    readLength = brRef.read(charArray);
  }
  Map map = new HashMap();
  map.put("id",2000);
  map.put("bigstring",clobRef);
  sqlSession.insert("insertBigString",map);
  sqlSession.commit();
  sqlSession.close();
}
