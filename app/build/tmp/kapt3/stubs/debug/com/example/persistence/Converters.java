package com.example.persistence;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u0010\f\u001a\u00020\u0004H\u0007J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\bH\u0007\u00a8\u0006\u000f"}, d2 = {"Lcom/example/persistence/Converters;", "", "()V", "fromInterestsList", "", "interests", "", "fromLocalDate", "", "date", "Ljava/time/LocalDate;", "toInterestsList", "interestsString", "toLocalDate", "epochDay", "app_debug"})
public final class Converters {
    @org.jetbrains.annotations.NotNull
    public static final com.example.persistence.Converters INSTANCE = null;
    
    private Converters() {
        super();
    }
    
    @androidx.room.TypeConverter
    public final long fromLocalDate(@org.jetbrains.annotations.NotNull
    java.time.LocalDate date) {
        return 0L;
    }
    
    @androidx.room.TypeConverter
    @org.jetbrains.annotations.NotNull
    public final java.time.LocalDate toLocalDate(long epochDay) {
        return null;
    }
    
    @androidx.room.TypeConverter
    @org.jetbrains.annotations.NotNull
    public final java.lang.String fromInterestsList(@org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> interests) {
        return null;
    }
    
    @androidx.room.TypeConverter
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> toInterestsList(@org.jetbrains.annotations.NotNull
    java.lang.String interestsString) {
        return null;
    }
}