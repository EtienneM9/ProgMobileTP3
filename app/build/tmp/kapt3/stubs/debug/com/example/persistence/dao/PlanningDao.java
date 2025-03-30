package com.example.persistence.dao;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u001c\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n2\u0006\u0010\u0004\u001a\u00020\u0005H\'J!\u0010\r\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u0019\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\fH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0012"}, d2 = {"Lcom/example/persistence/dao/PlanningDao;", "", "checkPlanningExists", "", "userId", "", "date", "", "(Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPlanningForUser", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/example/persistence/entities/DailyPlanning;", "getTodayPlanningForUser", "insertPlanning", "", "planning", "(Lcom/example/persistence/entities/DailyPlanning;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
@androidx.room.Dao
public abstract interface PlanningDao {
    
    @androidx.room.Insert
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object insertPlanning(@org.jetbrains.annotations.NotNull
    com.example.persistence.entities.DailyPlanning planning, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM daily_planning WHERE userId = :userId")
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.example.persistence.entities.DailyPlanning>> getPlanningForUser(@org.jetbrains.annotations.NotNull
    java.lang.String userId);
    
    @androidx.room.Query(value = "SELECT * FROM daily_planning WHERE userId = :userId AND date = :date")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getTodayPlanningForUser(@org.jetbrains.annotations.NotNull
    java.lang.String userId, long date, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.persistence.entities.DailyPlanning> $completion);
    
    @androidx.room.Query(value = "SELECT COUNT(*) FROM daily_planning WHERE userId = :userId AND date = :date")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object checkPlanningExists(@org.jetbrains.annotations.NotNull
    java.lang.String userId, long date, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion);
}