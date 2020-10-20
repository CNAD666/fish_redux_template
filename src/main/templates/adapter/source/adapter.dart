import 'package:fish_redux/fish_redux.dart';

import 'reducer.dart';
import 'state.dart';

class $nameAdapter extends SourceFlowAdapter<$nameState> {
  static const String default_item_type = 'default_item_type';

  $nameAdapter()
      : super(
          pool: <String, Component<Object>>{
            //Item Component
            default_item_type: XxxxxComponent()
          },
        );
}

