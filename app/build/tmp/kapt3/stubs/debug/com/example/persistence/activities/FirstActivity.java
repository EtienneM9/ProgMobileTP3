package com.example.persistence.activities;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\u0011\u0010\u001c\u001a\u00020\u001dH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001eJ\u0012\u0010\u001f\u001a\u00020\u001d2\b\u0010 \u001a\u0004\u0018\u00010!H\u0014J\u0011\u0010\"\u001a\u00020\u001dH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001eJ\b\u0010#\u001a\u00020\u001dH\u0016J\b\u0010$\u001a\u00020\u001dH\u0016J\u0011\u0010%\u001a\u00020\u001dH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001eR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\r\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001b\u0010\r\u001a\u0004\b\u0019\u0010\u001a\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006&"}, d2 = {"Lcom/example/persistence/activities/FirstActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/example/persistence/fragments/LoginFragment$LoginFragmentInterface;", "Lcom/example/persistence/fragments/SignUpFragment$SignupFragmentInterface;", "Lcom/example/persistence/fragments/ConfirmFragment$ConfirmSignupInterface;", "()V", "db", "Lcom/example/persistence/AppDatabase;", "loginViewModel", "Lcom/example/persistence/viewModels/LoginViewModel;", "getLoginViewModel", "()Lcom/example/persistence/viewModels/LoginViewModel;", "loginViewModel$delegate", "Lkotlin/Lazy;", "rootView", "Landroid/view/View;", "signUpViewModel", "Lcom/example/persistence/viewModels/SignUpViewModel;", "getSignUpViewModel", "()Lcom/example/persistence/viewModels/SignUpViewModel;", "signUpViewModel$delegate", "userDao", "Lcom/example/persistence/dao/UserDao;", "viewModel", "Lcom/example/persistence/viewModels/FirstViewModel;", "getViewModel", "()Lcom/example/persistence/viewModels/FirstViewModel;", "viewModel$delegate", "confirmSignup", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onLogin", "onSwitchToLogin", "onSwitchToSignUp", "signup", "app_debug"})
public final class FirstActivity extends androidx.appcompat.app.AppCompatActivity implements com.example.persistence.fragments.LoginFragment.LoginFragmentInterface, com.example.persistence.fragments.SignUpFragment.SignupFragmentInterface, com.example.persistence.fragments.ConfirmFragment.ConfirmSignupInterface {
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy viewModel$delegate = null;
    private com.example.persistence.AppDatabase db;
    private com.example.persistence.dao.UserDao userDao;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy signUpViewModel$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy loginViewModel$delegate = null;
    private android.view.View rootView;
    
    public FirstActivity() {
        super();
    }
    
    private final com.example.persistence.viewModels.FirstViewModel getViewModel() {
        return null;
    }
    
    private final com.example.persistence.viewModels.SignUpViewModel getSignUpViewModel() {
        return null;
    }
    
    private final com.example.persistence.viewModels.LoginViewModel getLoginViewModel() {
        return null;
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    public void onSwitchToSignUp() {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object onLogin(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override
    public void onSwitchToLogin() {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object signup(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object confirmSignup(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
}