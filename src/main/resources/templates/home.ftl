<#import "parts/common.ftl" as c>

<@c.page>
    <div class="form-group">
        <form method="post">

            <input type="date" class="form-control" name="addDate" placeholder="Выберите дату">
            <input type="text" class="form-control" name="product" placeholder="Введите название">
            <input type="number" class="form-control" name="price" placeholder="Введите стоимость">
            <button type="submit" class="btn btn-primary">Отправить</button>
        </form>
</@c.page>