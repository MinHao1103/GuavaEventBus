GuavaEventBus
===

1. 處理用戶註冊進行的操作，系統將帳號密碼儲存至資料庫，註冊成功後會發送簡訊通知和郵件通知
2. 註冊 SMSListener 及 EmailListener 至 Guava 的 EventBus
3. 當事件發生時，監聽器會自動接收事件並執行相對應的動作