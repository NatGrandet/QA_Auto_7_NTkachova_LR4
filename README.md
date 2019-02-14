# QA_Auto_7_NTkachova_LR4

Download selenium-server-standalone.jar and put it in the projects root folder https://www.seleniumhq.org/download/
Download binraies for browser and put them in the same folder with selenium-server-standalone.jar
<ol>
  <li>https://github.com/mozilla/geckodriver/releases</li>
  <li>http://chromedriver.chromium.org/</li>
</ol>



Start GRID server in terminal being in the root derictory:
<ol>
  <li>chmod +x selenium-server-standalone-3.13.0.jar</li>
</ol>

The next should be run in different terminals:
<ol>
  <li>java -jar selenium-server-standalone-3.13.0.jar -role hub</li>
  <li>java -jar selenium-server-standalone-3.13.0.jar -role node</li>
</ol>

Run test mvn clean test
