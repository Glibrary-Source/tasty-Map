package com.example.testmap.databinding;
import com.example.testmap.R;
import com.example.testmap.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class GridViewItemBindingImpl extends GridViewItemBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.rank_image, 3);
        sViewsWithIds.put(R.id.price_average, 4);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public GridViewItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private GridViewItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[2]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[4]
            , (android.widget.ImageView) bindings[3]
            );
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.menuImage.setTag(null);
        this.nameStore.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.photo == variableId) {
            setPhoto((com.example.testmap.network.MarsPhoto) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setPhoto(@Nullable com.example.testmap.network.MarsPhoto Photo) {
        this.mPhoto = Photo;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.photo);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String photoImgSrcUrl = null;
        com.example.testmap.network.MarsPhoto photo = mPhoto;
        java.lang.String photoId = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (photo != null) {
                    // read photo.imgSrcUrl
                    photoImgSrcUrl = photo.getImgSrcUrl();
                    // read photo.id
                    photoId = photo.getId();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            com.example.testmap.BindingAdaptersKt.bindImage(this.menuImage, photoImgSrcUrl);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.nameStore, photoId);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): photo
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}