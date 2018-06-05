import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.zhiyuliu.andriod_demo.R;
import com.example.zhiyuliu.andriod_demo.module.GirlFriend;

import java.util.List;

public class CardViewAdapter extends RecyclerView.Adapter<CardViewAdapter.CardViewHolder> {
    private Context mContext;
    private List<GirlFriend> mGirlList;

    public class CardViewHolder extends RecyclerView.ViewHolder {
        public TextView mTitle;
        public ImageView mImage;

        public CardViewHolder(View view) {
            super(view);
            mImage = itemView.findViewById(R.id.ivImage);
            mTitle = itemView.findViewById(R.id.tvTitle);
        }
    }

    public CardViewAdapter(Context mContext, List<GirlFriend> mGirlList) {
        this.mContext = mContext;
        this.mGirlList = mGirlList;
    }

    @Override
    public CardViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View mView = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_row, parent, false);
        return new CardViewHolder(mView);
    }

    @Override
    public void onBindViewHolder(final CardViewHolder holder, int position) {
        holder.mImage.setImageResource(mGirlList.get(position).getGirlImage());
        holder.mTitle.setText(mGirlList.get(position).getGirlName());
    }

    @Override
    public int getItemCount() {
        return mGirlList.size();
    }

}