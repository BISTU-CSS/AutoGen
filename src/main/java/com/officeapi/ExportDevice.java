package com.officeapi;

import com.Entity.Device;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileOutputStream;
import java.util.*;

public class ExportDevice {
    public static void exportExcel(List<Device> deviceList) {
        // 1. 创建工作簿
        XSSFWorkbook workbook = new XSSFWorkbook();
        // 2. 创建工作表
        XSSFSheet sheet = workbook.createSheet("DeviceList");
        int rowNum = 0;
        for (Device d : deviceList) {
            Row row = sheet.createRow(rowNum++);
            String[] strs = d.toArray();
            int i = 0;
            for (int cellNum = 0; cellNum < strs.length; cellNum++,i++) {
                Cell cell = row.createCell(cellNum);
                cell.setCellValue(strs[i]);
            }

        }


        try {
            File file = new File("设备清单.xlsx");
            FileOutputStream out = new FileOutputStream(file);
            workbook.write(out);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}


//    @PostMapping("user/export")
//    @ResponseBody
//    @ApiOperation(value="导出用户", httpMethod = "POST",produces="application/json",notes = "导出用户")
//    public ResultBean  exportUser(HttpServletResponse response) throws IOException{
//        List<SysUser> userList =  sysUserService.getUserList(); // 获取用户数据
//        Map<String, String> fieldMap = new LinkedHashMap<String, String>(); // 数据列信息
//        fieldMap.put("id", "编号");
//        fieldMap.put("name", "姓名");
//        fieldMap.put("pwd", "密码");
//        fieldMap.put("tel", "电话");
//        fieldMap.put("code", "编码");
//        fieldMap.put("comment", "备注");
//        XSSFWorkbook workbook = new XSSFWorkbook(); // 新建工作簿对象
//        XSSFSheet sheet = workbook.createSheet("UserList");// 创建sheet
//        int rowNum = 0;
//        Row row =  sheet.createRow(rowNum);// 创建第一行对象,设置表标题
//        Cell cell;
//        int cellNum = 0;
//        for (String name:fieldMap.values()){
//            cell = row.createCell(cellNum);
//            cell.setCellValue(name);
//            cellNum++;
//        }
//        int rows = 1;
//        for (SysUser user: userList){//遍历数据插入excel中
//            row = sheet.createRow(rows);
//            int col = 0;
//            row.createCell(col).setCellValue(user.getId()); // 编号id
//            row.createCell(col+1).setCellValue(user.getName()); // 姓名Name
//            row.createCell(col+2).setCellValue(user.getPwd()); // 密码pwd
//            row.createCell(col+3).setCellValue(user.getTel()); // 电话tel
//            row.createCell(col+4).setCellValue(user.getCode()); // 编码
//            row.createCell(col+5).setCellValue(user.getComment()); // 备注comment
//            rows++;
//        }
//        String fileName = "userInfo";
//        OutputStream out =null;
//        try {
//            out = response.getOutputStream();
//            response.reset();
//            response.addHeader("Content-Disposition", "attachment; filename=" + fileName + ".xlsx");
//            response.setContentType("application/vnd.ms-excel;charset=utf-8");
//            workbook.write(out);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }finally {
//            out.flush();
//            out.close();
//        }
//        return ResultBean.success();
//    }