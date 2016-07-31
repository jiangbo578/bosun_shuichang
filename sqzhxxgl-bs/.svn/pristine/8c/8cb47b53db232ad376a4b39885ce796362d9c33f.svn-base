<%@ page language="java" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html lang="zh">
<head>
<jsp:include page="/page/head.jsp"></jsp:include>
</head>
<body>
	 <ul class="breadcrumb" style="margin-bottom: 5px;">
 <li><a href="/centent"><i class="icon-home"></i>首页</a> <span class="divider">/</span></li>
    <li><a href="/taizhang/list/3">公共服务</a> <span class="divider">/</span></li>
    <li ><a href="/zzjbqk/list/1">组织基本情况</a> <span class="divider">/</span></li>
    <li class="active">审核报表</li>
  </ul>
	<div class="mianpan">
  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong>  组织基本情况</strong></div>
  <div id="panbody">
	<div class="container">
		<table class="table table-striped table-bordered table-hover">
			<tr>
				<th width="10%">标题：</th>
				<td width=90%">${businessForm.name }</td>
			</tr>
			<tr>
			<th>内容</th>
			<td>
				<table class="table table-striped table-bordered table-hover">
				
				<tbody>
					<c:forEach items="${datas}" var="zzjbqk" varStatus="num">
				<tr >
    <td width="400" valign="center" colspan="2" ><p >科&nbsp;普&nbsp;工&nbsp;作&nbsp;项&nbsp;目 </p></td>
    <td width="136" valign="center" ><p >内&nbsp;容 </p></td>
  </tr>
  <tr >
    <td width="117" valign="center" rowspan="4" ><p >1.人员保障 </p></td>
    <td width="283" valign="center" ><p >专职科普工作人员 </p></td>
    <td width="136" valign="center" ><p >${zzjbqk.zzkpry}人 </p></td>
  </tr>
  <tr >
    <td width="283" valign="center" ><p >兼职科普工作人员 </p></td>
    <td width="136" valign="center" ><p >${zzjbqk.jzkpyr}人 </p></td>
  </tr>
  <tr >
    <td width="283" valign="center" ><p >村（居）民担任科普志愿者人数 </p></td>
    <td width="136" valign="center" ><p >${zzjbqk.zyzrs }人 </p></td>
  </tr>
  <tr >
    <td width="283" valign="center" ><p >科普志愿者占居民人数比例 </p></td>
    <td width="136" valign="center" ><p >${zzjbqk.bl }%</p></td>
  </tr>
  <tr >
    <td width="117" valign="center" rowspan="12" ><p >2.设施条件 </p></td>
    <td width="283" valign="center" ><p >科普活动场所 </p></td>
    <td width="136" valign="center" ><p >${zzjbqk.hdcs }m&#178; </p></td>
  </tr>
  <tr >
    <td width="283" valign="center" ><p >室内 </p></td>
    <td width="136" valign="center" ><p >${zzjbqk.sn }m&#178; </p></td>
  </tr>
  <tr >
    <td width="283" valign="center" ><p >室外 </p></td>
    <td width="136" valign="center" ><p >${zzjbqk.sw }m&#178; </p></td>
  </tr>
  <tr >
    <td width="283" valign="center" ><p >科普宣传栏 </p></td>
    <td width="136" valign="center" ><p >${zzjbqk.kpxcl }米 </p></td>
  </tr>
  <tr >
    <td width="283" valign="center" ><p >内容更换频率 </p></td>
    <td width="136" valign="center" ><p >${zzjbqk.ghpl }次/年 </p></td>
  </tr>
  <tr >
    <td width="283" valign="center" ><p >科普图书 </p></td>
    <td width="136" valign="center" ><p >${zzjbqk.kpts }册 </p></td>
  </tr>
  <tr >
    <td width="283" valign="center" ><p >科普光盘 </p></td>
    <td width="136" valign="center" ><p >${zzjbqk.kpgp }张 </p></td>
  </tr>
  <tr >
    <td width="283" valign="center" ><p >科普展板 </p></td>
    <td width="136" valign="center" ><p >${zzjbqk.kpzb }块 </p></td>
  </tr>
  <tr >
    <td width="283" valign="center" ><p >科普展品 </p></td>
    <td width="136" valign="center" ><p >${zzjbqk.kpzp }件 </p></td>
  </tr>
  <tr >
    <td width="283" valign="center" ><p >科普设备名称 </p></td>
    <td width="136" valign="center" ><p >${zzjbqk.kpsbmc }</p></td>
  </tr>
  <tr >
    <td width="283" valign="center" ><p >数量 </p></td>
    <td width="136" valign="center" ><p >${zzjbqk.sl }台（件、套） </p></td>
  </tr>
  <tr >
    <td width="283" valign="center" ><p >其他 </p></td>
    <td width="136" valign="center" ><p >${zzjbqk.qt }</p></td>
  </tr>
  <tr >
    <td width="117" valign="center" rowspan="5" ><p >3.经费保障 </p></td>
    <td width="283" valign="center" ><p >年度科普经费 </p></td>
    <td width="136" valign="center" ><p >${zzjbqk.ndkpjf }元 </p></td>
  </tr>
  <tr >
    <td width="420" valign="center" colspan="2" ><p >其中： </p></td>
  </tr>
  <tr >
    <td width="283" valign="center" ><p >自筹经费 </p></td>
    <td width="136" valign="center" ><p >${zzjbqk.zcjf }元 </p></td>
  </tr>
  <tr >
    <td width="283" valign="center" ><p >区县财政拨款经费 </p></td>
    <td width="136" valign="center" ><p >${zzjbqk.bkjf }元 </p></td>
  </tr>
  <tr >
    <td width="283" valign="center" ><p >科普经费占本单位年度经费比例 </p></td>
    <td width="136" valign="center" ><p > ${zzjbqk.jfbl }%</p></td>
  </tr>
					
					
				</c:forEach>
				</tbody>
				</table>
			<div class="pagination" >
				<ul style="float: right;" id="b_pagination"></ul></div>
				</td>
			</tr>
			<tr>
				<th>审核</th>
				<td>
				<form action="/zzjbqk/check" method="post">
						  <div class="control-group">
    <label class="control-label" for="inputEmail">意见：</label>
    <div class="controls">
      <input type="text" name="remark"  class="input-xxlarge"  id="inputEmail" placeholder="请输入意见">

    </div>
  </div>
				<input type="hidden" name="businessFormId" value="${businessForm.id}">
				<input type="hidden" name="type" value="0" id="b_check_type">
				<button class="btn btn-primary"  type="submit"  id="b_check_pass"><i class="icon-ok-sign"></i>通过</button>
				<button class="btn btn-info" type="submit"  id="b_check_no_pass"><i class="icon-share-alt"></i>驳回</button>
				</form>
				</td>
			</tr></tbody>
		</table>
	</div>
	</div>
</div>

<jsp:include page="/page/footer.jsp"></jsp:include>
	<script>
		$(function() {
			//分页
			var pagination = new buguPagination('${current}',
					'${pages}', '${count}', '/zzjbqk/check/', '/${businessFormId }');
			$('#b_pagination').html(pagination.show());

			$('#b_check_pass').on('click', function(){
			if(confirm("确定要通过审核？")){
			$('#b_check_type').val(1);
			  return true;
			}
				return false;
			});
			$('#b_check_no_pass').on('click', function(){
			if(confirm("确定要驳回审核？")){
			$('#b_check_type').val(2);
			return true;
				 }
		     return false;	
			});
			
		});
		parent.iFrameHeight();
		
	</script>
</body>
</html>