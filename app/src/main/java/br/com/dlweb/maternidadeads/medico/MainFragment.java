package br.com.dlweb.maternidadeads.medico;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import br.com.dlweb.maternidadeads.R;


public class MainFragment extends Fragment {



    public MainFragment() {  }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        if(savedInstanceState == null ){
            getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.frame_medico, new ListarFragment()).commit();
        }

        return inflater.inflate(R.layout.medico_fragment_main, container, false);
    }
}