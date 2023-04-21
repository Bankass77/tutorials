package certification.tutorials.interfaces.functionaInterfaceTest;

import java.util.List;

public interface Feature<T> extends Feature1<T>, Feature2<T> {
	@Override
	void flaten(List<T> pList);

}
