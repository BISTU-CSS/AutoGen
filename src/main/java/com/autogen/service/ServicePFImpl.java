package com.autogen.service;

import com.autogen.dao.Mapper.DeviceMapper;
import com.autogen.dao.Mapper.InformationMapper;
import com.autogen.dao.Mapper.ScenceMapper;
import com.autogen.dao.entity.ScencePo;
import com.autogen.dao.entity.input.Sbhjs;
import com.autogen.dao.entity.input.Wlhhj;
import com.autogen.dao.entity.input.Wlhtx;
import com.autogen.dao.entity.input.Yyhsj;
import com.autogen.dao.entity.pf._1_WLHHJAQ;
import com.autogen.dao.entity.pf._2_WLHTXAQ;
import com.autogen.dao.entity.pf._3_SBHJSAQ;
import com.autogen.dao.entity.pf._4_YYHSJAQ;
import com.autogen.util.Convert;
import com.autogen.util.ExcelInfoUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.spire.xls.ExcelVersion;
import com.spire.xls.Workbook;
import com.spire.xls.Worksheet;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
@Slf4j
public class ServicePFImpl implements ServicePF{
    @Autowired
    ScenceMapper scenceMapper;
    @Autowired
    DeviceMapper deviceMapper;
    @Autowired
    InformationMapper informationMapper;

    @Override
    public List<_1_WLHHJAQ> getWlhhjData(List<Wlhhj> wlhhjlist) {
        List<_1_WLHHJAQ> list = new ArrayList<>();

        for(int i = 0;i<wlhhjlist.size();++i){
            String[] sfjb =  Convert.ConvertStateToScoreStr(scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("scence",wlhhjlist.get(i).getWlhhj_sfjb())).getCpzb());
            String[] dzmj =  Convert.ConvertStateToScoreStr(scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("scence",wlhhjlist.get(i).getWlhhj_dzmj())).getCpzb());
            String[] spjk =  Convert.ConvertStateToScoreStr(scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("scence",wlhhjlist.get(i).getWlhhj_spjk())).getCpzb());
            _1_WLHHJAQ wlhhj = new _1_WLHHJAQ(wlhhjlist.get(i).getWlhhj_jfmc(),sfjb,dzmj,spjk);
            list.add(wlhhj);
        }
        return list;
    }

    @Override
    public List<_2_WLHTXAQ> getWlhtxData(List<Wlhtx> wlhtxList) {
        List<_2_WLHTXAQ> list = new ArrayList<>();
        for(int i = 0;i<wlhtxList.size();++i){


            String[] sfjb = Convert.ConvertStateToScoreStr(scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("scence",wlhtxList.get(i).getWlhtx_xd().get(0))).getCpzb());
            String[] txsjwzx = Convert.ConvertStateToScoreStr(scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("scence",wlhtxList.get(i).getWlhtx_xd().get(1))).getCpzb());
            String[] txgcjmx = Convert.ConvertStateToScoreStr(scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("scence",wlhtxList.get(i).getWlhtx_xd().get(2))).getCpzb());
            String[] wlbjfwkzxxwzx = Convert.ConvertStateToScoreStr(scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("scence",wlhtxList.get(i).getWlhtx_xd().get(3))).getCpzb());
            String[] aqjrrz = Convert.ConvertStateToScoreStr(scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("scence",wlhtxList.get(i).getWlhtx_xd().get(4))).getCpzb());
            _2_WLHTXAQ wlhtx = new _2_WLHTXAQ(wlhtxList.get(i).getWlhtx_xdmc(),sfjb,txsjwzx,txgcjmx,wlbjfwkzxxwzx,aqjrrz);
            list.add(wlhtx);
        }
        return list;
    }

    @Override
    public List<_3_SBHJSAQ> getSbhjsData(List<Sbhjs> sbhjsList) {
        List<_3_SBHJSAQ> list = new ArrayList<>();
        for(int i = 0;i<sbhjsList.size();++i){
            String[] sfjb = Convert.ConvertStateToScoreStr(scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("scence",sbhjsList.get(i).getSbhjs_sfjb())).getCpzb());
            String[] ycgltdaq = Convert.ConvertStateToScoreStr(scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("scence",sbhjsList.get(i).getSbhjs_ycgl())).getCpzb());
            String[] xtzyfwkzxxwzx = Convert.ConvertStateToScoreStr(scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("scence",sbhjsList.get(i).getSbhjs_xtzy())).getCpzb());
            String[] zyxxzyaqbjwzx = Convert.ConvertStateToScoreStr(scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("scence",sbhjsList.get(i).getSbhjs_zyxx())).getCpzb());
            String[] rzjlwzx = Convert.ConvertStateToScoreStr(scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("scence",sbhjsList.get(i).getSbhjs_rzjl())).getCpzb());
            String[] zykzxcx = Convert.ConvertStateToScoreStr(scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("scence",sbhjsList.get(i).getSbhjs_zykz())).getCpzb());
            _3_SBHJSAQ sbhjs = new _3_SBHJSAQ(sbhjsList.get(i).getSbhjs_sbmc(),sfjb,ycgltdaq,xtzyfwkzxxwzx,zyxxzyaqbjwzx,rzjlwzx,zykzxcx);
            list.add(sbhjs);
        }
        return list;
    }

    @Override
    public List<_4_YYHSJAQ> getYyhsjData(List<Yyhsj> yyhsjList) {
        List<_4_YYHSJAQ> list = new ArrayList<>();

        for (int i = 0;i<yyhsjList.size();++i){
            String[] sfjb = Convert.ConvertStateToScoreStr(scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("scence",yyhsjList.get(i).getYyhsj_sfjb().get(0))).getCpzb());
            String[] fwkz = Convert.ConvertStateToScoreStr(scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("scence",yyhsjList.get(i).getYyhsj_fwkz())).getCpzb());
            String[] xxzy = Convert.ConvertStateToScoreStr(scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("scence",yyhsjList.get(i).getYyhsj_xxzy())).getCpzb());;
            String[] csjmx = Convert.ConvertStateToScoreStr(scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("scence",yyhsjList.get(i).getYyhsj_csjmx())).getCpzb());;
            String[] ccjmx = Convert.ConvertStateToScoreStr(scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("scence",yyhsjList.get(i).getYyhsj_ccjmx())).getCpzb());;
            String[] cswzx = Convert.ConvertStateToScoreStr(scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("scence",yyhsjList.get(i).getYyhsj_cswzx())).getCpzb());;
            String[] ccwzx = Convert.ConvertStateToScoreStr(scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("scence",yyhsjList.get(i).getYyhsj_ccwzx())).getCpzb());;
            String[] bkfr = Convert.ConvertStateToScoreStr(scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("scence",yyhsjList.get(i).getYyhsj_bkfr())).getCpzb());;
            _4_YYHSJAQ yyhsj = new _4_YYHSJAQ(yyhsjList.get(i).getYyhsj_ywmc(),sfjb,fwkz,xxzy,csjmx,ccjmx,cswzx,ccwzx,bkfr);
            list.add(yyhsj);
        }

        return list;
    }

    @Override
    public void genExcel(List<_1_WLHHJAQ> wlhhj, List<_2_WLHTXAQ> wlhtx, List<_3_SBHJSAQ> sbhjs, List<_4_YYHSJAQ> yyhsj) {
        //1.获取文件中的相关信息
        Workbook workbook = new Workbook();
        workbook.loadFromFile("./src/main/resources/MergeCells.xlsx");
        Worksheet worksheet = workbook.getWorksheets().get(0);
        //物理表格
        for(int i = 0;i<wlhhj.size();i++){
            worksheet.getRange().get(ExcelInfoUtil.COLUMN_RANGE_ARRAY[i*3+4]+"2").setText(wlhhj.get(i).cpdx);
            worksheet.getRange().get( ExcelInfoUtil.COLUMN_RANGE_ARRAY[i*3+4]+"4").setText(wlhhj.get(i).sfjb[0]);
            worksheet.getRange().get( ExcelInfoUtil.COLUMN_RANGE_ARRAY[i*3+5]+"4").setText(wlhhj.get(i).sfjb[1]);
            worksheet.getRange().get( ExcelInfoUtil.COLUMN_RANGE_ARRAY[i*3+6]+"4").setText(wlhhj.get(i).sfjb[2]);
            worksheet.getRange().get( ExcelInfoUtil.COLUMN_RANGE_ARRAY[i*3+4]+"5").setText(wlhhj.get(i).dzmjjlsjdccwzx[0]);
            worksheet.getRange().get( ExcelInfoUtil.COLUMN_RANGE_ARRAY[i*3+5]+"5").setText(wlhhj.get(i).dzmjjlsjdccwzx[1]);
            worksheet.getRange().get( ExcelInfoUtil.COLUMN_RANGE_ARRAY[i*3+6]+"5").setText(wlhhj.get(i).dzmjjlsjdccwzx[2]);
            worksheet.getRange().get( ExcelInfoUtil.COLUMN_RANGE_ARRAY[i*3+4]+"6").setText(wlhhj.get(i).spjkjlsjdccwzx[0]);
            worksheet.getRange().get( ExcelInfoUtil.COLUMN_RANGE_ARRAY[i*3+5]+"6").setText(wlhhj.get(i).spjkjlsjdccwzx[1]);
            worksheet.getRange().get( ExcelInfoUtil.COLUMN_RANGE_ARRAY[i*3+6]+"6").setText(wlhhj.get(i).spjkjlsjdccwzx[2]);
        }
        //网络表格
        for(int i = 0; i < wlhtx.size(); ++i){
            worksheet.getRange().get(ExcelInfoUtil.COLUMN_RANGE_ARRAY[i*3+4]+"8").setText(wlhtx.get(i).cpdx);
            worksheet.getRange().get( ExcelInfoUtil.COLUMN_RANGE_ARRAY[i*3+4]+"10").setText(wlhtx.get(i).sfjb[0]);
            worksheet.getRange().get( ExcelInfoUtil.COLUMN_RANGE_ARRAY[i*3+5]+"10").setText(wlhtx.get(i).sfjb[1]);
            worksheet.getRange().get( ExcelInfoUtil.COLUMN_RANGE_ARRAY[i*3+6]+"10").setText(wlhtx.get(i).sfjb[2]);
            worksheet.getRange().get( ExcelInfoUtil.COLUMN_RANGE_ARRAY[i*3+4]+"11").setText(wlhtx.get(i).txsjwzx[0]);
            worksheet.getRange().get( ExcelInfoUtil.COLUMN_RANGE_ARRAY[i*3+5]+"11").setText(wlhtx.get(i).txsjwzx[1]);
            worksheet.getRange().get( ExcelInfoUtil.COLUMN_RANGE_ARRAY[i*3+6]+"11").setText(wlhtx.get(i).txsjwzx[2]);
            worksheet.getRange().get( ExcelInfoUtil.COLUMN_RANGE_ARRAY[i*3+4]+"12").setText(wlhtx.get(i).txgczzysjdjmx[0]);
            worksheet.getRange().get( ExcelInfoUtil.COLUMN_RANGE_ARRAY[i*3+5]+"12").setText(wlhtx.get(i).txgczzysjdjmx[1]);
            worksheet.getRange().get( ExcelInfoUtil.COLUMN_RANGE_ARRAY[i*3+6]+"12").setText(wlhtx.get(i).txgczzysjdjmx[2]);
            worksheet.getRange().get( ExcelInfoUtil.COLUMN_RANGE_ARRAY[i*3+4]+"13").setText(wlhtx.get(i).wlbjfwkzxxdwzx[0]);
            worksheet.getRange().get( ExcelInfoUtil.COLUMN_RANGE_ARRAY[i*3+5]+"13").setText(wlhtx.get(i).wlbjfwkzxxdwzx[1]);
            worksheet.getRange().get( ExcelInfoUtil.COLUMN_RANGE_ARRAY[i*3+6]+"13").setText(wlhtx.get(i).wlbjfwkzxxdwzx[2]);
            worksheet.getRange().get( ExcelInfoUtil.COLUMN_RANGE_ARRAY[i*3+4]+"14").setText(wlhtx.get(i).aqjrrz[0]);
            worksheet.getRange().get( ExcelInfoUtil.COLUMN_RANGE_ARRAY[i*3+5]+"14").setText(wlhtx.get(i).aqjrrz[1]);
            worksheet.getRange().get( ExcelInfoUtil.COLUMN_RANGE_ARRAY[i*3+6]+"14").setText(wlhtx.get(i).aqjrrz[2]);
        }
        //设备
        for(int i = 0; i < sbhjs.size(); ++i){
            worksheet.getRange().get(ExcelInfoUtil.COLUMN_RANGE_ARRAY[i*3+4]+"16").setText(sbhjs.get(i).cpdx);
            worksheet.getRange().get( ExcelInfoUtil.COLUMN_RANGE_ARRAY[i*3+4]+"18").setText(sbhjs.get(i).sfjb[0]);
            worksheet.getRange().get( ExcelInfoUtil.COLUMN_RANGE_ARRAY[i*3+5]+"18").setText(sbhjs.get(i).sfjb[1]);
            worksheet.getRange().get( ExcelInfoUtil.COLUMN_RANGE_ARRAY[i*3+6]+"18").setText(sbhjs.get(i).sfjb[2]);
            worksheet.getRange().get( ExcelInfoUtil.COLUMN_RANGE_ARRAY[i*3+4]+"19").setText(sbhjs.get(i).ycgltdaq[0]);
            worksheet.getRange().get( ExcelInfoUtil.COLUMN_RANGE_ARRAY[i*3+5]+"19").setText(sbhjs.get(i).ycgltdaq[1]);
            worksheet.getRange().get( ExcelInfoUtil.COLUMN_RANGE_ARRAY[i*3+6]+"19").setText(sbhjs.get(i).ycgltdaq[2]);
            worksheet.getRange().get( ExcelInfoUtil.COLUMN_RANGE_ARRAY[i*3+4]+"20").setText(sbhjs.get(i).xtzyfwkzxxwzx[0]);
            worksheet.getRange().get( ExcelInfoUtil.COLUMN_RANGE_ARRAY[i*3+5]+"20").setText(sbhjs.get(i).xtzyfwkzxxwzx[1]);
            worksheet.getRange().get( ExcelInfoUtil.COLUMN_RANGE_ARRAY[i*3+6]+"20").setText(sbhjs.get(i).xtzyfwkzxxwzx[2]);
            worksheet.getRange().get( ExcelInfoUtil.COLUMN_RANGE_ARRAY[i*3+4]+"21").setText(sbhjs.get(i).zyxxzyaqbjwzx[0]);
            worksheet.getRange().get( ExcelInfoUtil.COLUMN_RANGE_ARRAY[i*3+5]+"21").setText(sbhjs.get(i).zyxxzyaqbjwzx[1]);
            worksheet.getRange().get( ExcelInfoUtil.COLUMN_RANGE_ARRAY[i*3+6]+"21").setText(sbhjs.get(i).zyxxzyaqbjwzx[2]);
            worksheet.getRange().get( ExcelInfoUtil.COLUMN_RANGE_ARRAY[i*3+4]+"22").setText(sbhjs.get(i).rzjlwzx[0]);
            worksheet.getRange().get( ExcelInfoUtil.COLUMN_RANGE_ARRAY[i*3+5]+"22").setText(sbhjs.get(i).rzjlwzx[1]);
            worksheet.getRange().get( ExcelInfoUtil.COLUMN_RANGE_ARRAY[i*3+6]+"22").setText(sbhjs.get(i).rzjlwzx[2]);
            worksheet.getRange().get( ExcelInfoUtil.COLUMN_RANGE_ARRAY[i*3+4]+"23").setText(sbhjs.get(i).zykzxcx[0]);
            worksheet.getRange().get( ExcelInfoUtil.COLUMN_RANGE_ARRAY[i*3+5]+"23").setText(sbhjs.get(i).zykzxcx[1]);
            worksheet.getRange().get( ExcelInfoUtil.COLUMN_RANGE_ARRAY[i*3+6]+"23").setText(sbhjs.get(i).zykzxcx[2]);
        }
        //应用
        //设备
        for(int i = 0; i < yyhsj.size(); ++i){
            worksheet.getRange().get(ExcelInfoUtil.COLUMN_RANGE_ARRAY[i*3+4]+"25").setText(yyhsj.get(i).cpdx);
            worksheet.getRange().get( ExcelInfoUtil.COLUMN_RANGE_ARRAY[i*3+4]+"27").setText(yyhsj.get(i).sfjb[0]);
            worksheet.getRange().get( ExcelInfoUtil.COLUMN_RANGE_ARRAY[i*3+5]+"27").setText(yyhsj.get(i).sfjb[1]);
            worksheet.getRange().get( ExcelInfoUtil.COLUMN_RANGE_ARRAY[i*3+6]+"27").setText(yyhsj.get(i).sfjb[2]);
            worksheet.getRange().get( ExcelInfoUtil.COLUMN_RANGE_ARRAY[i*3+4]+"28").setText(yyhsj.get(i).fwkzxxwzx[0]);
            worksheet.getRange().get( ExcelInfoUtil.COLUMN_RANGE_ARRAY[i*3+5]+"28").setText(yyhsj.get(i).fwkzxxwzx[1]);
            worksheet.getRange().get( ExcelInfoUtil.COLUMN_RANGE_ARRAY[i*3+6]+"28").setText(yyhsj.get(i).fwkzxxwzx[2]);
            worksheet.getRange().get( ExcelInfoUtil.COLUMN_RANGE_ARRAY[i*3+4]+"29").setText(yyhsj.get(i).zyxxzyaqbjwzx[0]);
            worksheet.getRange().get( ExcelInfoUtil.COLUMN_RANGE_ARRAY[i*3+5]+"29").setText(yyhsj.get(i).zyxxzyaqbjwzx[1]);
            worksheet.getRange().get( ExcelInfoUtil.COLUMN_RANGE_ARRAY[i*3+6]+"29").setText(yyhsj.get(i).zyxxzyaqbjwzx[2]);
            worksheet.getRange().get( ExcelInfoUtil.COLUMN_RANGE_ARRAY[i*3+4]+"30").setText(yyhsj.get(i).zysjcsjmx[0]);
            worksheet.getRange().get( ExcelInfoUtil.COLUMN_RANGE_ARRAY[i*3+5]+"30").setText(yyhsj.get(i).zysjcsjmx[1]);
            worksheet.getRange().get( ExcelInfoUtil.COLUMN_RANGE_ARRAY[i*3+6]+"30").setText(yyhsj.get(i).zysjcsjmx[2]);
            worksheet.getRange().get( ExcelInfoUtil.COLUMN_RANGE_ARRAY[i*3+4]+"31").setText(yyhsj.get(i).zysjccjmx[0]);
            worksheet.getRange().get( ExcelInfoUtil.COLUMN_RANGE_ARRAY[i*3+5]+"31").setText(yyhsj.get(i).zysjccjmx[1]);
            worksheet.getRange().get( ExcelInfoUtil.COLUMN_RANGE_ARRAY[i*3+6]+"31").setText(yyhsj.get(i).zysjccjmx[2]);
            worksheet.getRange().get( ExcelInfoUtil.COLUMN_RANGE_ARRAY[i*3+4]+"32").setText(yyhsj.get(i).zysjcswzx[0]);
            worksheet.getRange().get( ExcelInfoUtil.COLUMN_RANGE_ARRAY[i*3+5]+"32").setText(yyhsj.get(i).zysjcswzx[1]);
            worksheet.getRange().get( ExcelInfoUtil.COLUMN_RANGE_ARRAY[i*3+6]+"32").setText(yyhsj.get(i).zysjcswzx[2]);
            worksheet.getRange().get( ExcelInfoUtil.COLUMN_RANGE_ARRAY[i*3+4]+"33").setText(yyhsj.get(i).zysjccwzx[0]);
            worksheet.getRange().get( ExcelInfoUtil.COLUMN_RANGE_ARRAY[i*3+5]+"33").setText(yyhsj.get(i).zysjccwzx[1]);
            worksheet.getRange().get( ExcelInfoUtil.COLUMN_RANGE_ARRAY[i*3+6]+"33").setText(yyhsj.get(i).zysjccwzx[2]);
            worksheet.getRange().get( ExcelInfoUtil.COLUMN_RANGE_ARRAY[i*3+4]+"34").setText(yyhsj.get(i).bkfrx[0]);
            worksheet.getRange().get( ExcelInfoUtil.COLUMN_RANGE_ARRAY[i*3+5]+"34").setText(yyhsj.get(i).bkfrx[1]);
            worksheet.getRange().get( ExcelInfoUtil.COLUMN_RANGE_ARRAY[i*3+6]+"34").setText(yyhsj.get(i).bkfrx[2]);

        }

        workbook.saveToFile("ReplaceData.xlsx", ExcelVersion.Version2016);
    }
}
