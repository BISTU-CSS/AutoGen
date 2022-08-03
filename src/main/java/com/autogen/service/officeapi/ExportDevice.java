//package com.autogen.service.officeapi;
//
//import com.autogen.dao.entity.Device;
//import org.apache.poi.ss.usermodel.*;
//import org.apache.poi.ss.util.CellRangeAddress;
//import org.apache.poi.ss.util.RegionUtil;
//import org.apache.poi.xssf.usermodel.XSSFCellStyle;
//import org.apache.poi.xssf.usermodel.XSSFFont;
//import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//
//import java.io.File;
//import java.io.FileOutputStream;
//import java.util.List;
//
//public class ExportDevice {
//    public static void exportExcel(List<Device> deviceList) {
//        // 1. 创建工作簿
//        XSSFWorkbook workbook = new XSSFWorkbook();
//        // 2. 创建工作表
//        XSSFSheet sheet = workbook.createSheet("DeviceList");
//        //列宽
//        sheet.setColumnWidth(1, 18*256);
//        sheet.setColumnWidth(4, 70*256);
//        sheet.setColumnWidth(6, 25*256);
//        sheet.setColumnWidth(9, 25*256);
//        sheet.setColumnWidth(12, 20*256);
//        //style title 1
//        XSSFCellStyle styleTitle1 = workbook.createCellStyle();
//        styleTitle1.setAlignment(HorizontalAlignment.CENTER);
//        styleTitle1.setBorderBottom(BorderStyle.THIN);
//        styleTitle1.setBorderLeft(BorderStyle.THIN);
//        styleTitle1.setBorderRight(BorderStyle.THIN);
//        styleTitle1.setBorderTop(BorderStyle.THIN);
//        XSSFFont fontTitle1 = workbook.createFont();
//        fontTitle1.setFontName("黑体");
//        fontTitle1.setFontHeightInPoints((short) 20);//设置字体大小
//        fontTitle1.setBold(true);
//        styleTitle1.setFont(fontTitle1);
//        //style title 2
//        XSSFCellStyle styleTitle2 = workbook.createCellStyle();
//        styleTitle2.setFillForegroundColor(IndexedColors.GREY_25_PERCENT.getIndex());
//        styleTitle2.setFillPattern(FillPatternType.SOLID_FOREGROUND);
//        styleTitle2.setAlignment(HorizontalAlignment.CENTER);
//        styleTitle2.setBorderBottom(BorderStyle.THIN);
//        styleTitle2.setBorderLeft(BorderStyle.THIN);
//        styleTitle2.setBorderRight(BorderStyle.THIN);
//        styleTitle2.setBorderTop(BorderStyle.THIN);
//        XSSFFont fontTitle2 = workbook.createFont();
//        fontTitle2.setFontName("黑体");
//        fontTitle2.setFontHeightInPoints((short) 12);//设置字体大小
//        fontTitle2.setBold(true);
//        styleTitle2.setFont(fontTitle2);
//        //style text
//        XSSFCellStyle styleText = workbook.createCellStyle();
//        styleText.setAlignment(HorizontalAlignment.LEFT);
//        styleText.setVerticalAlignment(VerticalAlignment.CENTER);
//        styleText.setBorderBottom(BorderStyle.THIN);
//        styleText.setBorderLeft(BorderStyle.THIN);
//        styleText.setBorderRight(BorderStyle.THIN);
//        styleText.setBorderTop(BorderStyle.THIN);
//        styleText.setWrapText(true);
//        XSSFFont fontText = workbook.createFont();
//        fontText.setFontName("宋体");
//        fontText.setFontHeightInPoints((short) 11);//设置字体大小
//        styleText.setFont(fontText);
//
//        //表头
//        Row row0 = sheet.createRow(0);
//        Cell cell0 = row0.createCell(0);
//        cell0.setCellValue("信息系统密码应用方案设备清单");
//        sheet.addMergedRegion(new CellRangeAddress(0,0,0,12));
//        cell0.setCellStyle(styleTitle1);
//        addMergeCellBorder(new CellRangeAddress(0,0,0,12), sheet);
//        Row row1 = sheet.createRow(1);
//
//        String[] title = {"序号", "产品名称", "品牌", "产品型号", "功能说明", "类别", "配置", "数量", "单位", "质保", "单价(万元)", "总价(万元)", "备注"};
//        for (int i = 0; i < title.length; i++) {
//             Cell cell1 = row1.createCell(i);
//            cell1.setCellValue(title[i]);
//            cell1.setCellStyle(styleTitle2);
//        }
//
//        //从第二行开始创建
//        int rowNum = 2;
//        for (Device d : deviceList) {
//            Row row = sheet.createRow(rowNum++);
//            String[] strs = d.toArray();
//            int i = 0;
//
//            for (int cellNum = 0; cellNum < strs.length; cellNum++, i++) {
//                Cell cell = row.createCell(cellNum);
//                cell.setCellValue(strs[i]);
//                cell.setCellStyle(styleText);
//            }
//        }
//        Row rowEnd =  sheet.createRow(deviceList.size()+2);
//        Cell cellEnd = rowEnd.createCell(0);
//        cellEnd.setCellValue("合计");
//        sheet.addMergedRegion(new CellRangeAddress(deviceList.size()+2,deviceList.size()+2,0,10));
//        Cell cell = rowEnd.getCell(0);
//        cell.setCellStyle(styleTitle2);
//        addMergeCellBorder(new CellRangeAddress(deviceList.size()+2,deviceList.size()+2,0,10), sheet);
//        rowEnd.createCell(11).setCellStyle(styleTitle2);
//        rowEnd.createCell(12).setCellStyle(styleTitle2);
//        try {
//            File file = new File("设备清单.xlsx");
//            FileOutputStream out = new FileOutputStream(file);
//            workbook.write(out);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//
//    /**
//     * 添加边框线
//     * @param cra 区域
//     * @param sheet 页
//     */
//    private static void addMergeCellBorder(CellRangeAddress cra, Sheet sheet) {
//        RegionUtil.setBorderTop(BorderStyle.THIN,cra,sheet);
//        RegionUtil.setBorderBottom(BorderStyle.THIN,cra,sheet);
//        RegionUtil.setBorderLeft(BorderStyle.THIN,cra,sheet);
//        RegionUtil.setBorderRight(BorderStyle.THIN,cra,sheet);
//    }
//
//}
//
//
//
////    @PostMapping("user/export")
////    @ResponseBody
////    @ApiOperation(value="导出用户", httpMethod = "POST",produces="application/json",notes = "导出用户")
////    public ResultBean  exportUser(HttpServletResponse response) throws IOException{
////        List<SysUser> userList =  sysUserService.getUserList(); // 获取用户数据
////        Map<String, String> fieldMap = new LinkedHashMap<String, String>(); // 数据列信息
////        fieldMap.put("id", "编号");
////        fieldMap.put("name", "姓名");
////        fieldMap.put("pwd", "密码");
////        fieldMap.put("tel", "电话");
////        fieldMap.put("code", "编码");
////        fieldMap.put("comment", "备注");
////        XSSFWorkbook workbook = new XSSFWorkbook(); // 新建工作簿对象
////        XSSFSheet sheet = workbook.createSheet("UserList");// 创建sheet
////        int rowNum = 0;
////        Row row =  sheet.createRow(rowNum);// 创建第一行对象,设置表标题
////        Cell cell;
////        int cellNum = 0;
////        for (String name:fieldMap.values()){
////            cell = row.createCell(cellNum);
////            cell.setCellValue(name);
////            cellNum++;
////        }
////        int rows = 1;
////        for (SysUser user: userList){//遍历数据插入excel中
////            row = sheet.createRow(rows);
////            int col = 0;
////            row.createCell(col).setCellValue(user.getId()); // 编号id
////            row.createCell(col+1).setCellValue(user.getName()); // 姓名Name
////            row.createCell(col+2).setCellValue(user.getPwd()); // 密码pwd
////            row.createCell(col+3).setCellValue(user.getTel()); // 电话tel
////            row.createCell(col+4).setCellValue(user.getCode()); // 编码
////            row.createCell(col+5).setCellValue(user.getComment()); // 备注comment
////            rows++;
////        }
////        String fileName = "userInfo";
////        OutputStream out =null;
////        try {
////            out = response.getOutputStream();
////            response.reset();
////            response.addHeader("Content-Disposition", "attachment; filename=" + fileName + ".xlsx");
////            response.setContentType("application/vnd.ms-excel;charset=utf-8");
////            workbook.write(out);
////        } catch (Exception e) {
////            e.printStackTrace();
////        }finally {
////            out.flush();
////            out.close();
////        }
////        return ResultBean.success();
////    }