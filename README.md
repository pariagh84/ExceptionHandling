# سیستم مدیریت کتابخانه

این یک سیستم مدیریت کتابخانه ساده مبتنی بر جاوا است که به کاربران امکان مدیریت کتاب‌ها در یک کتابخانه را می‌دهد. این سیستم از اضافه کردن کتاب‌ها، امانت گرفتن کتاب‌ها، بازگرداندن کتاب‌ها و نمایش فهرست همه کتاب‌های موجود پشتیبانی می‌کند. همچنین شامل مدیریت خطاها برای سناریوهای مختلف مانند جزئیات نامعتبر کتاب، کتابخانه خالی و کتاب‌های پیدا نشده است.

## ویژگی‌ها
- اضافه کردن کتاب به کتابخانه با اعتبارسنجی عنوان و تعداد صفحات
- امانت گرفتن کتاب‌ها بر اساس عنوان
- بازگرداندن کتاب‌ها بر اساس عنوان
- نمایش فهرست همه کتاب‌های موجود در کتابخانه
- مدیریت خطاها برای ورودی‌های نامعتبر، کتابخانه خالی و کتاب‌های گمشده

## ساختار پروژه

- `Book.java`: کلاسی برای تعریف یک کتاب با ویژگی‌های عنوان و تعداد صفحات  
- `Library.java`: کلاسی برای مدیریت مجموعه کتاب‌ها و عملیات مربوط به آن‌ها  
- `Main.java`: کلاس اصلی که اجرای برنامه و تست عملکردها را شامل می‌شود  
- `BookNotFoundException.java`: استثنای سفارشی برای زمانی که کتابی پیدا نشود  
- `EmptyLibraryException.java`: استثنای سفارشی برای زمانی که کتابخانه خالی باشد  
- `InvalidBookException.java`: استثنای سفارشی برای اعتبارسنجی کتاب‌های نامعتبر

## خروجی نمونه
Library is empty

Page count must be positive

Title cannot be empty

Title cannot be empty

Book should not be null

Book should not be null

Book should not be null

Books in the Library:
Java Programming(300)

Successfully borrowed Book Java Programming(300)

Cannot return. Book with title Clean Code not found

Successfully returned Book Java Programming(300)
