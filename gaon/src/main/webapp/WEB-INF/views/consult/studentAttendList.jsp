<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<div class="product-status mg-b-15">
	<div class="container-fluid">
		<div class="row">
			<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
				<div class="product-status-wrap">

					<div class="asset-inner">
						<table>
							<tbody style="text-align: center;">
								<tr>
									
									<th style="width: 250px; text-align: center">1월</th>
									<th style="text-align: center; width: 320px">2월</th>
									<th style="text-align: center; width: 320px">3월</th>
									<th style="text-align: center; width: 320px">4월</th>
									<th style="text-align: center; width: 320px">5월</th>
									<th style="text-align: center; width: 320px">6월</th>
									<th style="text-align: center; width: 320px">7월</th>
									<th style="text-align: center; width: 320px">8월</th>
									<th style="text-align: center; width: 320px">9월</th>
									<th style="text-align: center; width: 320px">10월</th>
									<th style="text-align: center; width: 320px">11월</th>
									<th style="text-align: center; width: 320px">12월</th>
									
								</tr>
								
									<tr>
										<c:forEach var="list" items= "${Averages}">
											<td style="text-align: center;">${list}%</td>
										</c:forEach>
										
									</tr>
								
							</tbody>
						</table>