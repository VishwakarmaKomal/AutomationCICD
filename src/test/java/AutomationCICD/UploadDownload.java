package AutomationCICD;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class UploadDownload {

    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub

        String fruitName = "Apple";
        String updatedValue = "605";
        String fileName = "C:/Users/hp/Downloads/download.xlsx";
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
        driver.get("https://rahulshettyacademy.com/upload-download-test/index.html");
        //download

        driver.findElement(By.cssSelector("#downloadButton")).click();

        //Edit excel - getColumnNumber of Price -getRownumber of APple-> update excel with row,col
        int col = getColumnNumber(fileName, "price");
        int row = getRowNumber(fileName, fruitName);
        Assert.assertTrue(updateCell(fileName, row, col, updatedValue));


        //upload
        WebElement upload = driver.findElement(By.cssSelector("input[type='file']"));
        upload.sendKeys("C:/Users/hp/Downloads/download.xlsx");


        //wait for success message to show up and wait for disappear
        By toastLocator = By.cssSelector(".Toastify__toast-body div:nth-child(2");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(toastLocator));
        String toastText = driver.findElement(toastLocator).getText();
        System.out.println(toastText);
        Assert.assertEquals("Updated Excel Data Successfully.", toastText);

        wait.until(ExpectedConditions.invisibilityOfElementLocated(toastLocator));

        //verify updated excel data showing in the web table
        String priceColumn = driver.findElement(By.xpath("//div[text()='Price']")).getAttribute("data-column-id");
        String actualPrice = driver.findElement(By.xpath("//div[text()='" + fruitName + "']/parent::div/parent::div/div[@id='cell-" + priceColumn + "-undefined']")).getText();
        System.out.println(actualPrice);
        Assert.assertEquals(updatedValue, actualPrice);


    }

    private static boolean updateCell(String fileName, int row, int col, String updatedValue) throws IOException {
        FileInputStream fis = new FileInputStream(fileName);
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheet = workbook.getSheet("testdata");
        Row rows = sheet.getRow(row-1);
        Cell cellField= rows.getCell(col-1);
        cellField.setCellValue(updatedValue);
        FileOutputStream fos  = new FileOutputStream(fileName);
        workbook.write(fos);
        workbook.close();
        fis.close();
        return true;
    }

    private static int getRowNumber(String fileName, String fruitName) throws IOException {
        int rowNum = 0;
        FileInputStream fis = new FileInputStream(fileName);
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheet = workbook.getSheet("testdata");
        //identify testcase column by scanning the entire row
        Iterator<Row> rows = sheet.iterator();
        int k = 1;
        int rowIndex = -1;
        while (rows.hasNext()) {
            Row row = rows.next();
            Iterator<Cell> cells = row.cellIterator();
            while (cells.hasNext()) {
                Cell cell = cells.next();
                if(cell.getCellType()== CellType.STRING && cell.getStringCellValue().equalsIgnoreCase(fruitName)){
                    rowIndex = k;
                }

            }
            k++;
        }
        return rowIndex;

    }

    private static int getColumnNumber(String fileName, String colName) throws IOException {
        int colNum = 0;
        FileInputStream fis = new FileInputStream(fileName);
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        int sheets = workbook.getNumberOfSheets();
        for (int i = 0; i < sheets; i++) {
            if (workbook.getSheetName(i).equalsIgnoreCase("testdata")) {
                XSSFSheet sheet = workbook.getSheetAt(i);
                //Identify column name by accessing the 1st row
                Iterator<Row> rows = sheet.iterator();
                Row firstRow = rows.next();//going to 1st row
                //read each cell to know your desired column
                Iterator<Cell> cell = firstRow.cellIterator();
                int k = 1;
                while (cell.hasNext()) {
                    Cell value = cell.next();//grab the cell value in variable
                    //colNum++;
                    if (value.getStringCellValue().equalsIgnoreCase(colName)) {
                        //desired column
                        colNum = k;
                    }
                    k++;
                }
                System.out.println(colNum);

            }


        }
        return colNum;
    }

}