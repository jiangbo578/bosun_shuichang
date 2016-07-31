<?xml version="1.0"?>
<?mso-application progid="Excel.Sheet"?>
<Workbook xmlns="urn:schemas-microsoft-com:office:spreadsheet"
	xmlns:o="urn:schemas-microsoft-com:office:office" xmlns:x="urn:schemas-microsoft-com:office:excel"
	xmlns:ss="urn:schemas-microsoft-com:office:spreadsheet" xmlns:html="http://www.w3.org/TR/REC-html40">
	<DocumentProperties xmlns="urn:schemas-microsoft-com:office:office">
		<Author>Administrator</Author>
		<LastAuthor>Administrator</LastAuthor>
		<Created>2014-12-24T08:04:29Z</Created>
		<Version>12.00</Version>
	</DocumentProperties>
	<ExcelWorkbook xmlns="urn:schemas-microsoft-com:office:excel">
		<WindowHeight>7770</WindowHeight>
		<WindowWidth>20415</WindowWidth>
		<WindowTopX>0</WindowTopX>
		<WindowTopY>30</WindowTopY>
		<ProtectStructure>False</ProtectStructure>
		<ProtectWindows>False</ProtectWindows>
	</ExcelWorkbook>
	<Styles>
		<Style ss:ID="Default" ss:Name="Normal">
			<Alignment ss:Vertical="Center" />
			<Borders />
			<Font ss:FontName="宋体" x:CharSet="134" ss:Size="11" ss:Color="#000000" />
			<Interior />
			<NumberFormat />
			<Protection />
		</Style>
		<Style ss:ID="s76">
			<Alignment ss:Horizontal="Center" ss:Vertical="Center" />
			<Borders />
			<Font ss:FontName="宋体" x:CharSet="134" ss:Size="20" ss:Color="#000000"
				ss:Bold="1" />
		</Style>
		<Style ss:ID="s84">
			<Font ss:FontName="宋体" x:CharSet="134" ss:Size="11" ss:Color="#000000"
				ss:Bold="1" />
			<Interior ss:Color="#9BBB59" ss:Pattern="Solid" />
		</Style>
		<Style ss:ID="s85">
			<Font ss:FontName="宋体" x:CharSet="134" ss:Size="11" ss:Color="#000000"
				ss:Bold="1" />
			<Interior ss:Color="#9BBB59" ss:Pattern="Solid" />
			<NumberFormat ss:Format="0.00_);[Red]\(0.00\)" />
		</Style>
		<Style ss:ID="s86">
			<NumberFormat ss:Format="0.00_);[Red]\(0.00\)" />
		</Style>
	</Styles>
	<Worksheet ss:Name="Sheet1">
		<Table ss:ExpandedColumnCount="10" ss:ExpandedRowCount="${count}"
			x:FullColumns="1" x:FullRows="1" ss:DefaultColumnWidth="54"
			ss:DefaultRowHeight="13.5">
			<Column ss:Index="2" ss:AutoFitWidth="0" ss:Width="151.5" />
			<Column ss:StyleID="s86" ss:AutoFitWidth="0" ss:Span="5" />
			<Row ss:Height="25.5">
				<Cell ss:MergeAcross="9" ss:StyleID="s76">
					<Data ss:Type="String">2014年度村/居评级汇总</Data>
				</Cell>
			</Row>
			<Row>
				<Cell ss:StyleID="s84">
					<Data ss:Type="String">序号</Data>
				</Cell>
				<Cell ss:StyleID="s84">
					<Data ss:Type="String">名称</Data>
				</Cell>
				<Cell ss:StyleID="s85">
					<Data ss:Type="String">社会治安</Data>
				</Cell>
				<Cell ss:StyleID="s85">
					<Data ss:Type="String">公共安全</Data>
				</Cell>
				<Cell ss:StyleID="s85">
					<Data ss:Type="String"> <#if mark='2'>违法用地和建筑 <#else>住宅管理  </#if>  </Data>
				</Cell>
				<Cell ss:StyleID="s85">
					<Data ss:Type="String"><#if mark="2">农村生产环境 <#else>社区环境 </#if> </Data>
				</Cell>
				<Cell ss:StyleID="s85">
					<Data ss:Type="String">  <#if mark="2">三资管理  <#else>民主自治</#if></Data>
				</Cell>
				<Cell ss:StyleID="s85">
					<Data ss:Type="String">人口管理</Data>
				</Cell>
				<Cell ss:StyleID="s84">
					<Data ss:Type="String">建议评级</Data>
				</Cell>
				<Cell ss:StyleID="s84">
					<Data ss:Type="String">确认评级</Data>
				</Cell>
			</Row>
			<#list pjhz as score >
			<Row>
				<Cell>
					<Data ss:Type="Number">${score.id}</Data>
				</Cell>
				<Cell>
					<Data ss:Type="String">${score.zhen}-&gt;${score.name}</Data>
				</Cell>
				<Cell>
					<Data ss:Type="Number">${score.s2}</Data>
				</Cell>
				<Cell>
					<Data ss:Type="Number">${score.s1}</Data>
				</Cell>
				<Cell>
					<Data ss:Type="Number">${score.s3}</Data>
				</Cell>
				<Cell>
					<Data ss:Type="Number">${score.s6}</Data>
				</Cell>
				<Cell>
					<Data ss:Type="Number">${score.s5}</Data>
				</Cell>
				<Cell>
					<Data ss:Type="Number">${score.s4}</Data>
				</Cell>
				<Cell>
					<Data ss:Type="String">${score.pj}</Data>
				</Cell>
				<Cell>
					<Data ss:Type="String">C</Data>
				</Cell>
			</Row>
			</#list>
		</Table>
		<WorksheetOptions xmlns="urn:schemas-microsoft-com:office:excel">
			<PageSetup>
				<Header x:Margin="0.3" />
				<Footer x:Margin="0.3" />
				<PageMargins x:Bottom="0.75" x:Left="0.7" x:Right="0.7"
					x:Top="0.75" />
			</PageSetup>
			<Selected />
			<Panes>
				<Pane>
					<Number>3</Number>
					<ActiveRow>11</ActiveRow>
					<ActiveCol>3</ActiveCol>
				</Pane>
			</Panes>
			<ProtectObjects>False</ProtectObjects>
			<ProtectScenarios>False</ProtectScenarios>
		</WorksheetOptions>
	</Worksheet>
	<Worksheet ss:Name="Sheet2">
		<Table ss:ExpandedColumnCount="1" ss:ExpandedRowCount="1"
			x:FullColumns="1" x:FullRows="1" ss:DefaultColumnWidth="54"
			ss:DefaultRowHeight="13.5">
		</Table>
		<WorksheetOptions xmlns="urn:schemas-microsoft-com:office:excel">
			<PageSetup>
				<Header x:Margin="0.3" />
				<Footer x:Margin="0.3" />
				<PageMargins x:Bottom="0.75" x:Left="0.7" x:Right="0.7"
					x:Top="0.75" />
			</PageSetup>
			<ProtectObjects>False</ProtectObjects>
			<ProtectScenarios>False</ProtectScenarios>
		</WorksheetOptions>
	</Worksheet>
	<Worksheet ss:Name="Sheet3">
		<Table ss:ExpandedColumnCount="1" ss:ExpandedRowCount="1"
			x:FullColumns="1" x:FullRows="1" ss:DefaultColumnWidth="54"
			ss:DefaultRowHeight="13.5">
		</Table>
		<WorksheetOptions xmlns="urn:schemas-microsoft-com:office:excel">
			<PageSetup>
				<Header x:Margin="0.3" />
				<Footer x:Margin="0.3" />
				<PageMargins x:Bottom="0.75" x:Left="0.7" x:Right="0.7"
					x:Top="0.75" />
			</PageSetup>
			<ProtectObjects>False</ProtectObjects>
			<ProtectScenarios>False</ProtectScenarios>
		</WorksheetOptions>
	</Worksheet>
</Workbook>
