<#import "parts/common.ftl" as c>

<@c.page>
    <form method="get" action="/product">
        <input type="text" class="form-control" name="filter" value="${filter?if_exists}">
        <button type="submit" class="btn btn-primary" >Найти</button>
    </form>
    <div>Акции</div>
    <#list products as tools>
        <div>
            <table border="1" width="100%" cellpadding="5">
                <tr>
                    <th width="20%">Дата</th>
                    <th width="20%">Акции</th>
                    <th width="20%">Стоимость</th>
                    <th width="20%">Редактировать</th>


                </tr>
                <tr>
                    <td width="25%">${tools.addDate}</td>
                    <td width="25%">${tools.product}</td>
                    <td width="25%">${tools.price}</td>
                    <td width="25%"> <a href="/edit/${tools.id}">Редактировать</a></td>



                </tr>
            </table>
        </div>
    <#else>
        Акций нет
    </#list>

</@c.page>