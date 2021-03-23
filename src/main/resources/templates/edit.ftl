<#import "parts/common.ftl" as c>

<@c.page>
    <div class="form-group">
        <form  method="post" action="/edit">
            <input type="hidden" class="form-control" value="${products.id}"name="id">

            <input type="date" class="form-control" value="${products.addDate}"name="addDate">
            <input type="text" class="form-control" value="${products.product}"name="product">
            <input type="number" class="form-control" value="${products.price}"name="price">
            <button type="submit" class="btn btn-primary">Отправить</button>
        </form>
    </div>
</@c.page>